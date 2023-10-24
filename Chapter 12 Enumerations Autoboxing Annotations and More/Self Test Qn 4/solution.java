/*
 * The traffic light simulation developed in Try This 12-1 can be improved with a few simple changes that take advantage of
 * an enumeration's class features. In the version shown, the duration of eahc color was controlled by the
 * TrafficLightSimulator class by hard-coding these values into the run() emthod. Change this so that the duration of each
 * color is stored by the constants in the TrafficLightColor enumeration. To do this, you will need to add a constructor,
 * a private instance variabel and a method called getDelay(). After making these changes, what improvements do you see? On
 * your own, can you think of other improvements? (Hint: Try using ordinal values to switch light colors rather than relying
 * on a switch statement.)
 */

// An enumeration of the colors of a traffic light
enum TrafficLightColor {
    RED (12000), GREEN (10000), YELLOW (2000); // green for 10s, ywllow for 2s, red for 12s.

    private int sleep;
    TrafficLightColor(int s) {
        sleep = s;
    }

    int getDelay() {
        return sleep;
    }
}

// A computerized traffic light
class TrafficLightSimulator implements Runnable {
    private TrafficLightColor tlc; // holds the traffic light color
    private boolean stop = false; // set to true to stop the simulation
    private boolean changed = false; // true when the light has changed


    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
    }

    public void run() {
        while(!stop) {
            try {
                for (TrafficLightColor t: TrafficLightColor.values()) {
                    if(tlc.compareTo(t) == 0) {
                        Thread.sleep(tlc.getDelay());
                    }
                }
            }catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    // change color
    synchronized void changeColor() {
        switch(tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
        }
        changed = true;
        notify(); // signal that the light has changed
    }

    // Wait until a light change occurs.
    synchronized void waitForChange() {
        try {
            while (!changed)
                wait(); // wait for light to change
            changed = false;
        }catch(InterruptedException exc) {
            System.out.println(exc);
        }
    }

    // Return current color
    synchronized TrafficLightColor getColor() {
        return tlc;
    }

    // Stop the traffic light.
    synchronized void cancel() {
        stop = true;
    }
}

class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
        Thread thrd = new Thread(t1);
        thrd.start();

        for(int i=0; i<9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();
    }
}
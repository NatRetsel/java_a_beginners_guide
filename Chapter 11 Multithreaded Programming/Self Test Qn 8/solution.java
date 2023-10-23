/*
 * Change the TickTock class so that it acutally keeps time. That is, have each tick take one half second, and each tock take
 * one half second. Thus, each tick-tock will take one second. (Don't worry about the time it takes to switch tasks, etc)
 * 
 * We can use wait() or sleep() calls inside both tick and tock with 500 milliseconds supplied.
 */
// Use wait() and notify() to create a ticking clock
class TickTock {
    String state; // contains the state of the clock

    synchronized void tick(boolean running){
        if(!running) { // stop the clock
            state = "ticked";
            notify(); // notify any waiting threads
            return;
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted");
        }
        System.out.print("Tick ");
        state = "ticked"; // set the current state to ticked
        notify(); // let tock run
        try {
            while(!state.equals("tocked"))
                wait(); // wait for tock() to complete
        }catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void tock(boolean running) {
        if(!running) {
            state = "tocked";
            notify(); // nofity any waiting threads
            return;
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException exc) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Tock");
        state = "tocked"; // set the current state to tocked
        notify();
        try {
            while(!state.equals("ticked"))
                wait(); // wait for tick to complete
        }catch (InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }
}
class MyThread implements Runnable {
    Thread thrd;
    TickTock ttOb;

    // Construct a new thread.
    MyThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
    }

    // A factory emthod that creates and starts a thread
    public static MyThread createAndStart(String name, TickTock tt) {
        MyThread myThrd = new MyThread(name, tt);
        myThrd.thrd.start(); // start the thread
        return myThrd;
    }

    // Entry point of thread
    public void run() {
        if(thrd.getName().compareTo("Tick")==0) {
            for(int i=0; i<5; i++) {
                ttOb.tick(true);
            }
            ttOb.tick(false); // adding this is sufficient to prevent hanging - resolves wait() called by last tock()
        }else{
            for (int i=0; i<5; i++) {
                ttOb.tock(true);
            }
            //ttOb.tock(false); // add for completeness
        }
    }

}
class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread mt1 = MyThread.createAndStart("Tick", tt);
        MyThread mt2 = MyThread.createAndStart("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}
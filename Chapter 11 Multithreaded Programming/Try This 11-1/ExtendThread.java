/*
 * This projet instantiate thread objects by extending Thread
 */
class MyThread extends Thread {
    // Construct a new thread.
    MyThread(String name) {
        super(name); // name thread
    }
    public static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);
        myThrd.start();
        return myThrd;
    }
    // Entry point of thread
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for(int count=0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + count);
            }
        }catch (InterruptedException exc){
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}

class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        MyThread mt = MyThread.createAndStart("Child #1");

        for (int i=0; i<50; i++){
            System.out.println(".");
            try{
                Thread.sleep(100);
            }catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
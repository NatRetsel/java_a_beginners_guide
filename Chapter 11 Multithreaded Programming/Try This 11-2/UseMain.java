/*
 * All Java programs have at least one thread of execution, called the main thread, which is given to the program
 * automatically when it begins running. In this project, we will observe that the main thread can be handled just like
 * all other threads.
 */
class UseMain {
    public static void main(String[] args) {
        Thread thrd;

        // Get the main thread
        thrd = Thread.currentThread();

        // Display main thread's name.
        System.out.println("main thread is called: " + thrd.getName());

        // Display main thread's priority.
        System.out.println("Priority: " + thrd.getPriority());

        System.out.println();

        // Set the name and priority
        System.out.println("Setting name and priority.\n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY+3);

        System.out.println("Main thread is now called: " + thrd.getName());
        System.out.println("Priority is now: " + thrd.getPriority());
    }
}
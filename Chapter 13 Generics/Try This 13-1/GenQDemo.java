/*
 * Demonstrate a generic queue class
 */
class GenQDemo {
    public static void main(String[] args) {
        // create an integer queue.
        Integer[] iStore = new Integer[10];
        GenQueue<Integer> q = new GenQueue<Integer>(iStore);

        Integer iVal;

        System.out.println("Demonstrate a queue of Integers.");
        try {
            for(int i=0; i<5; i++) {
                System.out.println("Adding " + i + " to q.");
                q.put(i); // add integer value to q
            }
        }catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for(int i=0; i<5; i++) {
                System.out.print("Getting next Integer from q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        }catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println();

        // Create a Double queue
        Double[] dStore = new Double[10];
        GenQueue<Double> q2 = new GenQueue<Double>(dStore);
        Double dVal;

        System.out.println("Demonstrate a queue of Doubles.");
        try {
            for(int i=0; i<5; i++){
                System.out.println("Adding " + (double)i/2 + " to q2.");
                q2.put((double)i/2); // add double value to q2

            }
        }catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for(int i=0; i<5; i++) {
                System.out.print("Getting next Double from q2: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        }catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        Integer[] iCStore = new Integer[10];
        GenQueue<Integer> cq = new GenQueue<Integer>(iCStore);

        Integer iCVal;
        // Put some numbers into circular queue
        try {
            for(int i=0; i<10; i++){
                System.out.println("Adding " + i + " to cq.");
                cq.put(i);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }


        System.out.println();

        // Show the queue
        try {
            System.out.print("Contents of circular queue: ");
            for(int i=0; i<10; i++) {
                iCVal = cq.get();
                System.out.print(iCVal);
            }
        }catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println();

        //Put more numbers into circular queue.
        try {
            for(int i=10; i<20; i++) {
                System.out.println("Adding " + i + " to cq.");
                cq.put(i);
            }
        }catch (QueueFullException exc) {
            System.out.println(exc);
        }

        // Show the queue.
        System.out.print("Contents of circular queue: ");
        try {
            for(int i=0; i<10; i++) {
                iCVal = cq.get();
                System.out.print(iCVal);
            }
        }catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println("\nStore and consume from" + " circular queue.");

        //Store in and consume from circular queue.
        try {
            for(int i=0; i<20; i++) {
                cq.put(i);
                iCVal = cq.get();
                System.out.print(iCVal);
            }
        }catch (QueueFullException exc) {
            System.out.println(exc);
        }catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        Integer[] iDStore = new Integer[10];
        GenDynQueue<Integer> dq = new GenDynQueue<Integer>(iDStore);

        Integer iDVal;

        // Put some items into dynamic queue
        
        for(int i=0; i<10; i++) {
            System.out.println("Adding " + i + " to dq.");
            dq.put(i);
        }
        

        // Show the queue
        System.out.print("Contents of dynamic queue: ");
        try {
            for(int i=0; i<10; i++) {
                iDVal = dq.get();
                System.out.print(iDVal);
            }
            
        }catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();

        // put more items into dynamic queue
        for(int i=0; i<20; i++) {
            System.out.println("Adding " + i + " to dq.");
            dq.put(i);
        }

        System.out.println();

        // Show the queue
        System.out.print("Contents of dynamic queue: ");
        try {
            for(int i=0; i<20; i++) {
                iDVal = dq.get();
                System.out.print(iDVal);
            }
            
        }catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println();
    }
}
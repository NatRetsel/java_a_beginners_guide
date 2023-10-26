// A circular queue.
class GenCircularQueue<T> implements IGenQ<T> {
    private T[] q; // this array holds the queue
    private int putloc, getloc; // the put and get indices


     // Construct an empty queue with the given array
     public GenCircularQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    // put a character into the queue
    public void put(T obj) throws QueueFullException{
        /*
         * Queue is full if either putloc is one less than getloc or if putloc is at the end of the array
         * and getloc is at the beginning.
         */
        if(putloc+1 == getloc | ((putloc==q.length-1) & (getloc==0))) {
            throw new QueueFullException(q.length);
        }
        q[putloc++] = obj;
        if (putloc==q.length) putloc = 0; // loop back
    }

    // Get a character from the queue
    public T get() throws QueueEmptyException{
        if (getloc == putloc) {
            throw new QueueEmptyException();        
        }

        T ch = q[getloc++];
        if(getloc==q.length) getloc = 0; // loop back
        return ch;
    }
}

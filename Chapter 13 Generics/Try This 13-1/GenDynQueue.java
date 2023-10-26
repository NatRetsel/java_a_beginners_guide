class GenDynQueue <T> implements IGenQ<T> {
    private T[] q; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // Construct an empty queue given its size.
    public GenDynQueue(T[] aRef) {
        q = aRef; // allocate memory for queue
        putloc = getloc = 0;
    }

    // Put a character into the queue
    public void put(T obj) {
        if(putloc == q.length) {
            // increase queue size
            
            T[] t = (T[]) new Object[q.length*2];
            
            // copy elements into new queue
            for (int i =0; i < q.length; i++) 
                t[i] = q[i];
            
            q = t;
        }
        q[putloc++] = obj ;
    }

    // Get a character from the queue
    public T get() throws QueueEmptyException{
        if (getloc == putloc) {
            throw new QueueEmptyException();
        }
        return q[getloc++];
    }
}

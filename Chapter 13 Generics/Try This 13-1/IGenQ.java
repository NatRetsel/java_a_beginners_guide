// A generic queue interface

public interface IGenQ<T> {
    // put an iteminto the queue.
    void put(T ch) throws QueueFullException;

    // Get an item from queue.
    T get() throws QueueEmptyException;
}
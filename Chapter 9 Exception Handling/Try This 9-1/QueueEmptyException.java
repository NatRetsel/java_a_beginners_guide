// An exception for queue-empty errors.s
public class QueueEmptyException extends Exception{
    public String toString() {
        return "\nQueue is empty.";
    }
}

// interface for stack
public interface IGenStack <T> {

    // push elements into stack
    void push(T ch) throws StackFullException;

    // pop elements from the stack
    T pop() throws StackEmptyException;
}
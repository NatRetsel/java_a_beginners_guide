// Implement generic stack class
class GenStack<T> implements IGenStack<T> {
    private T[] s;
    private int putloc;

    GenStack(T[] arr){
        s = arr;
        putloc = 0;
    }

    GenStack(GenStack<T> ob){
        s = (T[]) new Object[ob.s.length];
        putloc = ob.putloc;

        for (int i=0; i < putloc; i++) s[i] = ob.s[i];
    }

    public void push(T ch) throws StackFullException{
        if (putloc == s.length) {
            throw new StackFullException(s.length);
        }
        s[putloc] = ch;
        putloc++;
    }

    public T pop() throws StackEmptyException{
        if (putloc == 0 ){
            throw new StackEmptyException();
        }
        T return_val = s[putloc-1];
        putloc--;
        return return_val;
    }
}

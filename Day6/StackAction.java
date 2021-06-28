package Day6;

public class StackAction<T> {
    T value;
    StackAction<T> next;

    public StackAction(T value, StackAction<T> next)
    {
        this.value=value;
        this.next=next;

    }
    public StackAction<T> getNext()
    {
        return next;
    }
    public T getValue()
    {
        return value;
    }
}

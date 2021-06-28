package Day6;

public class Stack<T> {
    int size;
    StackAction<T> top;

    public Stack()
    {
        size = 0;
        top = null;

    }
public void push(T newValue)
{
    StackAction<T> newAction = new StackAction<T>(newValue,top);
    top = newAction;
    size++;
}
    public T pop()
    {
        StackAction<T> oldTop = top;
        if (size==0)
        {
            return null;
        }
        top=top.getNext();
        return oldTop.getValue();
    }
    
    public static void main(String[] args) {
    Stack<String> myStringStack= new Stack<String>();
    myStringStack.push("Guna");
    myStringStack.push("Raman");
    myStringStack.push("Swetha");
    myStringStack.push("Aman");
    System.out.println();
    System.out.println(myStringStack.pop());
    }
}

import java.util.ArrayList;
public class StackArray <T> implements Stack {


    private  ArrayList<T> stack =
            new ArrayList<>();

    @Override
    public void push(T item) {

        stack.add(0,item);
    }
    @Override
    public T pop() throws  MyEmptyStackException {
        if(this.isEmpty()){
            throw new MyEmptyStackException("Stack is Empty, you cannot pop anything from an Empty Stack ");
        }
        return stack.remove(0);
    }
    @Override
    public void peek() {
        System.out.println("The top is "
        + stack.get(0));
    }
    @Override
    public boolean isEmpty() {
        return stack.size() == 0;
    }
}

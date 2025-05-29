import java.lang.reflect.Type;

public class StackLinkedList implements Stack{

    StackItem<T> top;
    @Override
    public void push(T item) {
        StackItem newBox = new StackItem(item);
        StackItem previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }
    @Override
    public Object pop() throws MyEmptyStackException {
        if(this.top == null){
            throw new MyEmptyStackException("Stack is empty ");
        }
        T tempData = top.getData();
        top = top.getNext();
        return tempData;
    }

    @Override
    public void peek() {
        System.out.println("The top is "
        + this.top.getData());
    }
    @Override
    public boolean isEmpty() {
        return this.top == null;
    }
    public void displayStack(){
        StackItem<T> tempNode = top;
        if(this.isEmpty()){
            System.out.println("The stack is empty");
        }else{
            do {
                System.out.println(tempNode.getData());
                tempNode = tempNode.getNext();
            }
            while (tempNode != null );

        }

    }

    @Override
    public String toString() {
        return "StackLinkedList{" +
                "top=" + top +
                '}';
    }
}

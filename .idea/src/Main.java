//import java.util.Iterator;
//import java.util.*;

//import java.util.Stack;
public class Main {
    public static void main(String[] args)  {

        StackLinkedList<Number>stack=new StackLinkedList();
        stack.push(3);
        stack.push(45);
        stack.push(3.4);
        //stack.push("This is a test");
        System.out.println(stack);
        stack.displayStack();
        /*
        try{
            stack.pop();
        }catch (Exception e){
            System.out.println(e);
        }


        Stack stack=new StackLinkedList();
        try{
            stack.pop();
        }catch (Exception e){
            System.out.println(e);
        }

         */

        /*
        ArrayList<String> stringArrayList= new ArrayList<String>();
        stringArrayList.add("String");

        HashMap<String , Double> grades=new HashMap<>();
        grades.put("Ali",35.0);
        System.out.println(grades);
        grades.put("Pelin",90.0);
        System.out.println(grades);
        grades.put("Enes",10.0);
        System.out.println(grades);
        grades.put("Ali",60.0);
        System.out.println(grades);
        System.out.println(grades.keySet().getClass());
        System.out.println(grades.keySet() instanceof Set);

        Stack stack = new StackLinkedList();
        stack.push("This is a string");
        stack.push(5);
        stack.peek();
        System.out.println("Is empty "
        +stack.isEmpty() );
        System.out.println("Pop = " +
                stack.pop());
        stack.peek();

         */

    }
}
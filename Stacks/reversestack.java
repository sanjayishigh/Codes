import java.util.*;

public class reversestack {
    public static void pushatBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushatBottom(s,data);
        s.push(top);

    }

    public static void reversestk(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reversestk(stack);
        pushatBottom(stack,top);
        
    }
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Original: " + stack);

        reversestk(stack);

        System.out.println("Reversed: " + stack);
    }   
}

import java.util.Stack;

public class pushatbottom {
    public static void pushatBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatBottom(s, data);
        s.push(top);
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

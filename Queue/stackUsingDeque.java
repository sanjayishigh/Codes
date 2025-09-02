import java.util.Deque;
import java.util.LinkedList;

class MyStack {
    Deque<Integer> deque = new LinkedList<>();

    public void push(int data) {
        deque.addLast(data);
    }

    public int pop() {
        return deque.removeLast();
    }

    public int peek() {
        return deque.getLast();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }
}

public class stackUsingDeque {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());   // 3
        System.out.println(s.peek());  // 2
    }
}

import java.util.*;

public class Using2QueuesPushCostly  {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // isEmpty
        public boolean isEmpty() {
            return q1.isEmpty();
        }

        // push → O(n), no swapping
        public void push(int data) {
            // Step 1: move everything from q1 → q2
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            // Step 2: add new element to q1
            q1.add(data);

            // Step 3: move everything back q2 → q1
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        // pop → O(1)
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.remove();
        }

        // peek → O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.peek();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Top: " + s.peek()); // 3

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}

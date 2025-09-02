import java.util.*;

public class Using2StackPopCostly {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // isEmpty
        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // add (enqueue) → O(1)
        public void add(int data) {
            s1.push(data);
        }

        // remove (dequeue) → O(n)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            // Move elements s1 → s2
            while (s1.size() > 1) {
                s2.push(s1.pop());
            }

            // Last element in s1 is the front of queue
            int front = s1.pop();

            // Move back s2 → s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return front;
        }

        // peek (front element)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            while (s1.size() > 1) {
                s2.push(s1.pop());
            }

            int front = s1.peek();

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return front;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Peek: " + q.peek()); // 1

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}

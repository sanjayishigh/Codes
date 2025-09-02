import java.util.Deque;
import java.util.LinkedList;

class MyQueue {
    Deque<Integer> deque = new LinkedList<>();

    // Add element to the back of the queue
    public void add(int data) {
        deque.addLast(data);
    }

    // Remove element from the front of the queue (FIFO)
    public int remove() {
        return deque.removeFirst();
    }

    // Peek at the front element without removing it
    public int peek() {
        return deque.getFirst();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return deque.isEmpty();
    }
}

public class queueUsingDeque {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Peek" + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove()); 
        
    }
}

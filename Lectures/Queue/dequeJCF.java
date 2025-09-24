import java.util.*;
import java.util.LinkedList;

public class dequeJCF {
    public static void main(String[] args){
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(0);

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque);

        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque);

        
    }
}

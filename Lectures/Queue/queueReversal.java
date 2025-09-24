import java.util.*;
import java.util.LinkedList;

public class queueReversal {
    // public static void reversalrecurssion(Queue<Integer> q) {
    //     // base case
    //     if (q.isEmpty()) {
    //         return;
    //     }
        
    //     int front = q.remove();   // remove front element
    //     reversalrecurssion(q);              // reverse the rest of the queue
    //     q.add(front);             // add the removed element at the end
    // }

    public static void reversal(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){;
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reversal(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}

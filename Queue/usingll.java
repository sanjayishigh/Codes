import java.util.*;

public class usingll {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static Boolean isEmpty(){
            return head == null && tail == null;
        }

        //add
        public static void add(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = tail = newNode;
                return ;
            }

            tail.next = newNode;
            tail = newNode;

        }

        //remove
        public static void remove(){
            if(head == null){
                System.out.println("Queue is Empty");
                return ;
            }

            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
        }

        //peek
        public static int peek(){
            return head.data;
        }

    }

    public static void main(String[] args){
        Queue q =  new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}

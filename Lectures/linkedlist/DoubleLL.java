public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data =  data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data){
        Node newNode =  new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        size++;
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        newNode.next=null;
        

    }

    public void add(int data, int idx) {
    Node newNode = new Node(data);

    // Case 1: Insert at head
    if (idx == 0) {
        addFirst(data);
        return;
    }

    Node temp = head;
    int i = 0;

    // Traverse to the node just before the given index
    while (i < idx - 1 && temp != null) {
        temp = temp.next;
        i++;
    }

    if (temp == null) {
        System.out.println("Index out of bounds");
        return;
    }

    // Case 2: Insert at tail
    if (temp.next == null) {
        temp.next = newNode;
        newNode.prev = temp;
        tail = newNode;  // update tail
        return;
    }
    // Case 3: Insert in middle
    newNode.next = temp.next;
    newNode.prev = temp;
    temp.next.prev = newNode;
    temp.next = newNode;
    }


    //print
    public void print(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove
    public int removeFirst() {
    if (head == null) {
        System.out.println("List is empty, nothing to remove");
        return Integer.MIN_VALUE;
    }

    int val = head.data;

    // Case 1: only one node
    if (head == tail) {
        head = tail = null;
    } else { // Case 2: more than one node
        head = head.next;
        head.prev = null;
    }

    size--;
    return val;
    }

    public void remove(int idx){

    }
    
    public void reverse(){
        if(head==null){
            System.out.println("No elements");
            return;
        }

        Node curr = head;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String args[]){
        DoubleLL dll = new DoubleLL();

        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        dll.reverse();
        dll.print();
    }
}

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) { // O(1)
        // Step 1 : Create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2 : new Node next is head
        newNode.next = head;

        // Step 3 : new Node is head
        head = newNode;
    }

    public void addLast(int data) { // O(1)
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print() { // O(n)
        Node temp = head;

        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {// O(n)
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.print("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.print("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key)
                return i;
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        // prev, curr, next
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deletefronNthnode(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (sz == n) {
            head = head.next;
            return;
        }

        int i = 1;
        int itoFind = sz - n;
        Node prev = head;
        while (i < itoFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; //mid
    }

    public Boolean checkpalindrome(){
        if(head == null || head.next == null){ //for cases with 0 or 1 element
            return true;
        }

        Node midnode = findMid(head); // find mid node

        //reverse the right part
        Node prev = null;
        Node curr = midnode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static Boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        Boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        slow = head;
        Node prev = null;

        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle - last element null
        prev.next = null;
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; //midNode
    }

    private Node merge(Node head1,Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1!=null && head2!=null){
            if(head1.data < head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next =  head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;  
        }

        return mergedLL.next;
    }

    public Node mergesort(Node head){
        //base case
        if(head == null || head.next ==null){
            return head;
        }

        //find mid
        Node mid = getMid(head);

        //left and right mergesort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergesort(head);
        Node newRight =  mergesort(rightHead);

        //merge
        return merge(newLeft,newRight);
    }

    public void zigzag(){
        //find mid
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        Node midNode = slow;

        //reverse
        Node curr = midNode.next;
        midNode.next =null;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL;Node nextR;

        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.print();
        ll.zigzag();
        ll.print();

        // head =  new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // System.out.print(isCycle());
        // removeCycle();
        // System.out.print(isCycle());
        
        
        
    
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(3);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
        // ll.add(4, 5);
        // ll.print();
        // ll.reverse();
        // ll.print();

        // System.out.println("Size of ll : " + size);
        // System.out.println(ll.itrSearch(2));
        // System.out.println(ll.recSearch(3));

        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(1);
        
        // System.out.print(ll.checkpalindrome());


    }
}

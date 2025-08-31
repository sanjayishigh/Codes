public class CircularLL {
    static class Node {
        int data;
        Node next;
    }

    // Insert into empty list
    static Node addToEmpty(Node last, int data) {
        if (last != null) return last;

        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        last.next = last;  // circular
        return last;
    }

    // Insert at front
    static Node addFront(Node last, int data) {
        if (last == null) return addToEmpty(last, data);

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    // Insert at end
    static Node addEnd(Node last, int data) {
        if (last == null) return addToEmpty(last, data);

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        last = newNode; // new node becomes last
        return last;
    }

    // Insert after a given node
    static Node addAfter(Node last, int data, int item) {
        if (last == null) return null;

        Node p = last.next;
        do {
            if (p.data == item) {
                Node newNode = new Node();
                newNode.data = data;
                newNode.next = p.next;
                p.next = newNode;

                if (p == last) last = newNode; // update last if needed
                return last;
            }
            p = p.next;
        } while (p != last.next);

        System.out.println(item + " not present in the list.");
        return last;
    }

    // Delete a node
    static Node deleteNode(Node last, int key) {
        if (last == null) return null;

        Node temp = last, curr = last.next;

        // Case 1: Only one node
        if (last.data == key && last.next == last) {
            last = null;
            return last;
        }

        // Case 2: Deleting head node
        if (curr.data == key) {
            while (temp.next != last.next) {
                temp = temp.next;
            }
            temp.next = curr.next;
            last.next = curr.next;
            return last;
        }

        // Case 3: Deleting other nodes
        while (curr.next != last.next && curr.next.data != key) {
            curr = curr.next;
        }

        if (curr.next.data == key) {
            curr.next = curr.next.next;
            // If deleting last node
            if (last.data == key) last = curr;
        } else {
            System.out.println("Node " + key + " not found.");
        }
        return last;
    }

    // Print circular list
    static void traverse(Node last) {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        Node p = last.next;
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != last.next);
        System.out.println();
    }

    public static void main(String[] args) {
        Node last = null;

        last = addToEmpty(last, 6);
        last = addEnd(last, 8);
        last = addFront(last, 2);
        last = addAfter(last, 10, 2);

        System.out.println("Circular Linked List after insertion:");
        traverse(last);

        last = deleteNode(last, 8);
        System.out.println("After deleting 8:");
        traverse(last);

        last = deleteNode(last, 6);
        System.out.println("After deleting 6:");
        traverse(last);
    }
}

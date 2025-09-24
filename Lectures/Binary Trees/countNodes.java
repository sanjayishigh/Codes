public class countNodes {
    static class Node{
        Node right;
        Node left;
        int data;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);

        return leftCount + rightCount + 1;  // +1 for the current node
    
    }


    public static void main(String args[]){
        // Tree structure:
        //        1
        //      /   \
        //     2     3
        //    / \     \
        //   4   5     6


         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // Example: print root node’s data
        System.out.println(count(root));
    }
}

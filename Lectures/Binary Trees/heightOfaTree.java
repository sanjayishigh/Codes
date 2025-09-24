public class heightOfaTree {
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

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        int height = Math.max(lh,rh) + 1;

        return height;
    }

    public static void main(String args[]){
        // Tree structure:
        //        1
        //      /   \
        //     2     3
        //    / \   / \
        //   4   5 6   7


         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Example: print root node’s data
        System.out.println(height(root));
    }
}

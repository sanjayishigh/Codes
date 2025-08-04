public class addone {
    public static void main(String[] args) {
        int x = 5;

        int result = -~x;

        System.out.println("Original: " + x);
        System.out.println("After -~x (x + 1): " + result);  // Output: 6
    }
}

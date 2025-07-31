public class LargestInArray {
    public static int findLargest(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 83, 9, 19, 41, 99, 5, 90};
        int largest = findLargest(numbers);
        System.out.println("Largest number: " + largest);
    }
}

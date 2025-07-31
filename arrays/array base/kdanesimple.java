public class kdanesimple {
    public static void kadaneMaxSum(int[] numbers) {
        int maxSum = numbers[0];
        int currSum = 0;

        for (int i = 1; i < numbers.length; i++) {
            currSum = Math.max(numbers[i], currSum + numbers[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = {-4, -83, -9, -19, -41}; // try with positives too
        kadaneMaxSum(numbers);
    }
}

public class PrefixArray {

    public static void printAllSubarraysWithPrefixSum(int[] number) {
        int n = number.length;
        int[] prefixSum = new int[n];

        prefixSum[0] = number[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + number[i];
        }

        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;

        System.out.println("Prefix Sum Array: ");
        for (int p : prefixSum) {
            System.out.print(p + " ");
        }
        System.out.println("\n");

        System.out.println("All subarray sums (using Prefix Sum):");

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int start = i;
                int end = j;
                int sum = 0;

                if (start == 0) {
                    sum = prefixSum[end];
                } else {
                    sum = prefixSum[end] - prefixSum[start - 1];
                }

                System.out.print(sum + " ");

                if (sum > maxsum) {
                    maxsum = sum;
                }
                if (sum < minsum) {
                    minsum = sum;
                }
            }
            System.out.println();
        }

        System.out.println("\nMax sum: " + maxsum);
        System.out.println("Min sum: " + minsum);
    }

    public static void main(String args[]) {
        int number[] = {4, 83, 9, 19, 41, 99, 5, 90};
        printAllSubarraysWithPrefixSum(number);
    }
}

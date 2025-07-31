public class subarraysum {
    public static void printAllSubarrays(int number[]) {
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += number[k];
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
        System.out.println("Max sum: " + maxsum);
        System.out.println("Min sum: " + minsum);
    }

    public static void main(String args[]) {
        int number[] = {4, 83, 9, 19, 41, 99, 5, 90};
        System.out.println("All subarray sums:");
        printAllSubarrays(number);
    }
}

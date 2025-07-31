public class pairsum {
    public static void printAllPairs(int numbers[]) {
        int totalPairs = 0;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;

                System.out.print("(");
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }
                System.out.print("= " + sum + ") ");
                totalPairs++;
            }
            System.out.println();
        }

        System.out.println("\nTotal number of subarrays: " + totalPairs);
    }

    public static void main(String[] args) {
        int[] numbers = {4, 83, 9, 19, 41};
        printAllPairs(numbers);
    }
}

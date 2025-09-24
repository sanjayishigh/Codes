public class allPairs {
    public static void printAllPairs(int numbers[]) {
        int totalPairs = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + ", " + numbers[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }

        System.out.println("Total number of pairs: " + totalPairs);
    }

    public static void main(String[] args) {
        int[] numbers = {4, 83, 9, 19, 41};
        printAllPairs(numbers);
    }
}

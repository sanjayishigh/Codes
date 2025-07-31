public class AllPairs {
    public static void printAllPairs(int numbers[]) {
        int totalPairs = 0;

        for (int i = 0; i < numbers.length; i++) {
            int start=i;
            for (int j = i; j < numbers.length; j++) {
                int end=j;
                System.out.print("(");
                for(int k=start ; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.print(")");
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

public class subarray {
    public static int printAllSubarrays(int number[]) {
        int totalSubarrays = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                System.out.print("(");
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.print(") ");
                totalSubarrays++;
            }
            System.out.println();
        }
        return totalSubarrays;
    }

    public static void main(String args[]) {
        int number[] = {4, 83, 9, 19, 41, 99, 5, 90};
        System.out.println("All subarrays:");
        int count = printAllSubarrays(number);
        System.out.println("\nTotal number of subarrays: " + count);
    }
}

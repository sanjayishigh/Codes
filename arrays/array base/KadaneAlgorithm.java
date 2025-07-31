// public class KadaneAlgorithm {
//     public static void kadaneMaxSum(int[] number) {
//         int maxSum = Integer.MIN_VALUE;
//         int currentSum = 0;

//         for (int i = 0; i < number.length; i++) {
//             currentSum += number[i];
//             if (currentSum > maxSum) {
//                 maxSum = currentSum;
//             }
//             if (currentSum < 0) {
//                 currentSum = 0;
//             }
//         }
//         }

//         System.out.println("Maximum Subarray Sum: " + maxSum);
//     }

//     public static void main(String[] args) {
//         int[] number = {4, -83, 9, -19, 41, 99, -5, 90};
//         kadaneMaxSum(number);
//     }
// }

public class KadaneAlgorithm {
    public static void kadaneMaxSum(int[] number) {
        int maxSum = Integer.MIN_VALUE;
        int currsum = 0;
        boolean allNegative = true;
        int maxElement = number[0];


        for (int i = 0; i < number.length; i++) {
            if (number[i] > 0) {
                allNegative = false;
            }
            if (number[i] > maxElement) {
                maxElement = number[i];
            }

            currsum += number[i];

            if (currsum > maxSum) {
                maxSum = currsum;
            }

            if (currsum < 0) {
                currsum = 0;
            }
        }

        if (allNegative) {
            maxSum = maxElement;
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    

    public static void main(String[] args) {
        int[] number = {-4, -83, -9, -19, -41, -99, -5, -90}; // All negative test
        kadaneMaxSum(number);
    }
}

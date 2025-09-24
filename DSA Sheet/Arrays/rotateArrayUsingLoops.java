// Let's trace it with your example: nums = {1,2,3,4,5,6,7} and k = 3.

// i = 0: nums[0] is 1. New index is (0 + 3) % 7 = 3. So, arr[3] = 1.

// i = 1: nums[1] is 2. New index is (1 + 3) % 7 = 4. So, arr[4] = 2.

// i = 2: nums[2] is 3. New index is (2 + 3) % 7 = 5. So, arr[5] = 3.

// i = 3: nums[3] is 4. New index is (3 + 3) % 7 = 6. So, arr[6] = 4.

// i = 4: nums[4] is 5. New index is (4 + 3) % 7 = 0. So, arr[0] = 5.

// i = 5: nums[5] is 6. New index is (5 + 3) % 7 = 1. So, arr[1] = 6.

// i = 6: nums[6] is 7. New index is (6 + 3) % 7 = 2. So, arr[2] = 7.

// After this loop, arr will look like this: {5, 6, 7, 1, 2, 3, 4}.

import java.util.Arrays;

public class rotateArrayUsingLoops {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // handle cases where k > n

        int[] arr = new int[n];

        // put each element in its new position
        for(int i = 0; i < n; i++) {
            arr[(i + k) % n] = nums[i];
        }

        // copy back to nums
        for(int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}

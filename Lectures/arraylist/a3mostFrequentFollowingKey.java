import java.util.ArrayList;
import java.util.HashMap;

public class a3mostFrequentFollowingKey {
    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequencies of targets that follow key
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                int target = nums.get(i + 1);
                freq.put(target, freq.getOrDefault(target, 0) + 1);
            }
        }

        // Find target with maximum frequency
        int ans = -1;
        int maxCount = 0;
        for (int target : freq.keySet()) {
            if (freq.get(target) > maxCount) {
                maxCount = freq.get(target);
                ans = target;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);

        int key = 1;
        System.out.println(mostFrequent(nums, key)); // ✅ Output: 100
    }
}

// public int mostFrequent(ArrayList<Integer> nums, int key) {
//     int[] result = new int[1000]; // assume nums only contains numbers <= 999
    
//     // Count how many times each number follows key
//     for (int i = 0; i < nums.size() - 1; i++) {
//         if (nums.get(i) == key) {
//             result[nums.get(i + 1)]++;
//         }
//     }

//     int max = 0;
//     int ans = -1;

//     // Find number with maximum frequency
//     for (int i = 0; i < result.length; i++) {
//         if (result[i] > max) {
//             max = result[i];
//             ans = i;   // no need to do +1
//         }
//     }

//     return ans;
// }

// The code iterates through the rest of the array (i = 1 to length - 1).
// i = 1: nums[1] is 2. This is the same as candidate.
// count becomes 2. (candidate = 2, count = 2)
// i = 2: nums[2] is 1. This is different from candidate.
// count becomes 1. (candidate = 2, count = 1)
// i = 3: nums[3] is 1. This is different from candidate.
// count becomes 0. (candidate = 2, count = 0)
// i = 4: nums[4] is 1. Now, count is 0.
// This is the key step: we reset the candidate.
// candidate becomes nums[4], which is 1.
// count is reset to 1. (candidate = 1, count = 1)
// i = 5: nums[5] is 2. This is different from candidate.
// count becomes 0. (candidate = 1, count = 0)
// i = 6: nums[6] is 2. count is 0.
// We reset the candidate again.
// candidate becomes nums[6], which is 2.
// count is reset to 1. (candidate = 2, count = 1)

public class majorityElement {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int candidate = nums[0];
        int count = 1;

        for(int i=1; i<n; i++){
            if(count == 0){
                candidate = nums[i];
                count = 1;
            }else if(candidate == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums));
    }
}

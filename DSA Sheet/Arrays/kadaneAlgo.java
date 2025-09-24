public class kadaneAlgo{
    public static int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;

        for(int i=0; i<nums.length; i++){
            currsum = Math.max(nums[i],currsum + nums[i]);
            maxsum = Math.max(currsum, maxsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] nums = {-1,2,-3,4,-5,6,-7};
        
        System.out.println(maxSubArray(nums));
    }
}
    

public class maxProductSubarray {
     public static int maxProduct(int[] nums) {
        int currmax = nums[0];
        int currmin = nums[0];
        int maxprod = nums[0];

        for(int i=1;i<nums.length; i++){
            
            int temp = currmax;

            currmax = Math.max(nums[i],Math.max(currmax*nums[i], currmin*nums[i]));
            currmin = Math.min(nums[i],Math.min(temp*nums[i], currmin*nums[i]));
            maxprod = Math.max(maxprod, currmax);
    
        }
        return maxprod;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};

        System.out.println(maxProduct(nums));
    }
}

import java.util.Arrays;

public class squares {
    public static int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }

         Arrays.sort(nums);

        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};

        sortedSquares(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

public class triple {
    public static void triplet(int[] nums) {
        boolean found = false;

        for (int i = 0; i < nums.length-2; i++) {

            if (nums[i] + nums[i+1] + nums[i+2] == 0) {
                System.out.println(nums[i] + " " + nums[i+1] + " " + nums[i+2]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No triplets found!");
        }
    }

    public static void main(String args[]) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        triplet(nums);
    }
}

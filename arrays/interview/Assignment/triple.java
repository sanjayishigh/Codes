public class triple {
    public static void triplet(int nums[]) {
        boolean hasDuplicates = false;
        int tri[] = new int[3];

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = 0; j < nums.length; j++) {
                int end =j;
                for(int k=0; k< nums.length ; k++){
                    if(i != j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0){
                        tri[k] = nums[i];
                    }
                }
            }
        }
        System.out.print(tri);    
    }

    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 1, 1, 3, 2, 2, 2};
        triplet(nums);
    }
}

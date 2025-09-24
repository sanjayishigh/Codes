import java.util.ArrayList;

public class a2lonelynum {
    public static void lonelynum(ArrayList<Integer> nums){
        int num;
        for(int i=0;i<nums.size();i++){
            num = nums.get(i);
            
            if (!nums.contains(num - 1) && !nums.contains(num + 1)) {
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(6);
        nums.add(7);
        nums.add(2);
        nums.add(8);
        nums.add(9);
        nums.add(5);
        nums.add(11);


        lonelynum(nums);
    }
}

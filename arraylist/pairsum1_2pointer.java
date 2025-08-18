import java.util.ArrayList;

public class pairsum1_2pointer {
    public static void pairsum(ArrayList<Integer> nums, int key) {
        int lp = 0;
        int rp = nums.size()-1;

        while (lp < rp) {
            if (nums.get(lp) + nums.get(rp) == key) {
                System.out.println(lp + " " + rp);
            }
            
            if(nums.get(lp) + nums.get(rp)< key) {
                lp++;
            }else {
                rp--;
            }
        }
    }

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        pairsum(nums, 5);

    }
}

import java.util.ArrayList;

public class pairsum1_brute {
    public static boolean pairsum(ArrayList<Integer> nums, int key) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) == key) {
                    System.out.println(i + " " + j);
                }
            }
        }
        System.out.println("Does not exist");
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        pairsum(nums,5);

    }
}

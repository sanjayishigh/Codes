import java.util.ArrayList;

public class a1monotonic {
    public static Boolean monotonic(ArrayList<Integer> nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i+1)) {
                increasing = false;
            }
            if (nums.get(i) < nums.get(i+1)) {
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        nums.add(10);

        System.out.print(monotonic(nums)); // true ✅
    }
}

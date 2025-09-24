import java.util.ArrayList;

public class pairsum2 {
    //Rotated sorted array
    public static void pairsum(ArrayList<Integer> nums,int key){
        int lp=0;
        int rp=0;
        //find pivot
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)>nums.get(i+1)){
                rp = i;
                lp = i+1;
            }
        }

        //2 pointer approach
        while(lp!=rp){
            if(nums.get(lp)+nums.get(rp) == key){
                System.out.print(lp + " " + rp);
            }
            if(nums.get(lp)+nums.get(rp)<key){
                lp = (lp+1)%nums.size();
            }else{
                rp = (rp-1+nums.size())%nums.size();
            }
        }

    }
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(11);
        nums.add(12);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        pairsum(nums,23);

    }
}

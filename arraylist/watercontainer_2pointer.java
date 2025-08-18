import java.util.ArrayList;

public class watercontainer_2pointer {
    public static int maxwater(ArrayList<Integer> h){
        int lp = 0;
        int rp = h.size()-1;
        int maxwater =0;

        while(lp<rp){
            int height = Math.min(h.get(lp),h.get(rp));
            int width = rp-lp;
            int currwater = height*width;
            maxwater = Math.max(currwater,maxwater);

            if(h.get(lp)<h.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }

        return maxwater;
    }
    public static void main(String args[]){
        ArrayList<Integer> h = new ArrayList<>();

        h.add(1);
        h.add(8);
        h.add(6);
        h.add(2);
        h.add(5);
        h.add(4);
        h.add(8);
        h.add(6);
        h.add(7);

        System.out.print(maxwater(h));
    }
}

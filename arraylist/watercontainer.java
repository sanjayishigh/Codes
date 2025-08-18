import java.util.*;
public class watercontainer {
    public static int maxwater(ArrayList<Integer> h){
        int maxwater = 0;
        int n = h.size();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int height = Math.min(h.get(i),h.get(j));
                int width = j-i;
                int currwater = height*width;
                maxwater = Math.max(currwater,maxwater);
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

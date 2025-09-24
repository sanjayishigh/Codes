import java.util.ArrayList;

public class swap {

    public static void main(String args[]){
         ArrayList<Integer> list = new ArrayList<>();
         int idx1 = 4;
         int idx2 = 1;

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
    }
}

import java.util.Arrays;
public class watercontainer {
    public static int maxwater(int h[]){
        int maxarea = Integer.MIN_VALUE;
        int n = h.length;
        

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int area = Math.min(h[i],h[j])*(j-i);
                maxarea = Math.max(area,maxarea);
            }
        }
             
        return maxarea;
    }
    public static void main(String args[]){
        int h[] = {1,8,6,2,5,4,8,3,7};
        System.out.print(maxwater(h));
    }
}

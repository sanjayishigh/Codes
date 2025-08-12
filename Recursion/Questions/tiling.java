public class tiling{
    //2*n board and 2*1 tile - arrange
    public static int tile(int n){
        if(n==0 || n==1){
            return 1;
        }

        int V = tile(n-1);
        int H = tile(n-2);

        int totalWays = V + H;

        return totalWays;
    }
    public static void main(String args[]){
        int n = 3;
        System.out.println(tile(n));
    }
}
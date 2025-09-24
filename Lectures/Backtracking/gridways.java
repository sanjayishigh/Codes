public class gridways {
    public static int gridWays(int i, int j, int n, int m){ //O(n) = O(2^n+m)
        //basecase
        if(i ==n-1 && j == m-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }

        int w1 = gridWays(i+1,j,n,m);
        int w2 = gridWays(i,j+1,n,m);

        return w1 + w2;
    }

    public static void main(String args[]){
        System.out.print(gridWays(0,0,3,3));
    }
    
}

public class gridwayspermutation {
    public static int factorial(int n){
        if(n==0 || n==1){
            return n;
        }
        return n*factorial(n-1);
    }
    public static int gridways(int n,int m){
        // O(n) = O(n+m)
        return factorial(n-1+m-1)/(factorial(n-1)*factorial(m-1));
    }
    public static void main(String args[]){
        int n = 3;
        int m = 3;
        System.out.print(gridways(n,m));
    }
}

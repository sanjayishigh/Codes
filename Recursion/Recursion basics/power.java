public class power {
    public static int pow(int x, int n){
        if(n==0){
            return 1;
        }
        // int xnn = pow(x,n-1);
        // int xn = x*xnn;
        // return xn;
        return x*pow(x,n-1);
    }
    public static void main(String args[]){
        int x = 5;
        int n = 2;
        System.out.print(pow(x,n));
    }
}

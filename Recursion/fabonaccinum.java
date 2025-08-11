public class fabonaccinum {
    public static int fibn(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib = fibn(n-1) + fibn(n-2);
        return fib;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(fibn(n));
    }
}

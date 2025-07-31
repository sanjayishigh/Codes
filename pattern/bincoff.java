import java.util.*;

public class bincoff {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1 ; i<=n; i++){
            fact*=i;
        }
          return fact;
    }
    public static int bcoff(int n,int r){
        int a = factorial(n);
        int b = factorial(n-r);
        int c = factorial(r);

        int ans = a/b*c;
        return ans; 
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        System.out.print("Enter r :");
        int r = sc.nextInt();
        System.out.print(bcoff(n,r));
        sc.close();
    }
}
    

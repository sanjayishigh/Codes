import java.util.*;

public class reversen {
    public static int reverse(int n){
        int rev = 0;
        do{
            int lastd = n%10;
            n=n/10;
            rev = rev*10 + lastd;
        }while(n>0);
        return rev;
    }
    // public static int reverse(int n) {
    //     int rev = 0;
    //     for (; n > 0; n = n / 10) {
    //         int lastd = n % 10;
    //         rev = rev * 10 + lastd;
    //     }
    //     return rev;
    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        System.out.print("reverse :"+ reverse(n));
        
    }
}
    

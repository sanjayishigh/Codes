import java.util.*;

public class reversen {
    public static int reversenumber(int n){
        int reverse =0;
        while(n>0){
            int lastdigit = n%10;
            reverse = reverse*10 + lastdigit;
            n=n/10;
        }
        return reverse;
    }
       
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        System.out.print("Reverse :"+ reversenumber(n));
        
    }
}
    

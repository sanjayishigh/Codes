import java.util.*;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if (n==2){
            System.out.print("2 is a prime number");
        }
        else{
            boolean isprime = true ;
            for(int i=2; i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isprime = false;
                }
            }
            if(isprime =  true){
                 System.out.print(n +" is a prime number");
                }
            else{
                System.out.print(n +" is a not a prime number");

            }
        }
        sc.close();
        
    }
    
}

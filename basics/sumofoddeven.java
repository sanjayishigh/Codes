import java.util.*;
public class sumofoddeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int evensum = 0;
        int oddsum = 0;
       

        do{
            System.out.print("Enter the number:");
            int n = sc.nextInt();

            if(n%2==0){
                evensum+=n;
            }
            else{
                oddsum+=n;
            }
            if (n==0){
                break;
            }

        }while(true);

        System.out.println("Evensum is "+evensum);
        System.out.println("Oddsum is "+oddsum);



    }
    
}

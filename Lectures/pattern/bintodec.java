import java.util.*;

public class bintodec {
    public static int btod(int n) {
        int dec = 0;
        int pow = 0;

        do{
            int lastd = n % 10;
            dec += lastd * Math.pow(2, pow);
            pow++;
            n /= 10;
        }while(n>0);

        return dec;
    }
    // public static int dtob(int n) {
    //     int bin = 0;
    //     int i = 0;
    //     do{
    //         int rem = n % 2;
    //         bin = bin + rem*((int)Math.pow(10,i));
    //         i++;
    //         n /= 2;
    //     }while(n>0);

    //     return bin;

    // }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Decimal : " + btod(n));
    }
}

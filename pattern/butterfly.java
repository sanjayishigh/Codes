import java.util.*;

public class butterfly {
    public static void hollow_rectangle(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<=i ; j++) {
               System.out.print("*");
            }
            for (int j =1;j<= 2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
    }
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<=n-i+1 ; j++) {
               System.out.print("*");
            }
            for (int j =1;j<=2*(i-1);j++){
                System.out.print(" ");
            }
            for (int j =1;j<=n-i+1;j++){
                System.out.print("*");
            }
        System.out.println();
    }
}   

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        hollow_rectangle(4);
    }
}

import java.util.*;

public class factorial {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int factorial = 1;
        
        if (n == 0) {
            System.out.println("Factorial is: " + factorial);
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial is: " + factorial);
        }
        
        sc.close();
    }
}

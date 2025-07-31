import java.util.*;
public class multiplicationtable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int answer = 0;

        for(int i=1; i<=10; i++){
            answer = n*i;
            System.out.println(answer);
        }

    }
}

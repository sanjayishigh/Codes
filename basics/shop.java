import java.util.*;

public class shop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pen = 10;
        float pencil = 10;
        float eraser = 5;

        System.out.print("Enter the number of pens:");
        float a = sc.nextInt();
        System.out.print("Enter the number of pencil:");
        float b = sc.nextInt();
        System.out.print("Enter the number of eraser:");
        float c = sc.nextInt();

        float sum = pen*a + pencil*b + eraser*c;

        float cost =(sum + sum*0.18f);
       

        System.out.print(cost);
        sc.close();
    }
    
}

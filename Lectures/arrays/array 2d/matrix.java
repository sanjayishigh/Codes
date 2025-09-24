import java.util.*;
public class matrix {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int matrix[][] =new int[3][3];
        int n =matrix.length;
        int m = matrix[0].length;

       
        System.out.print("Enter :");
        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter key element :");
        int key = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n;j++){
                if(key == matrix[i][j]){
                    System.out.print(i + " " + j);
                }
            }
        }

    }
    
}

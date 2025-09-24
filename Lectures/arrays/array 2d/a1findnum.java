import java.util.*;
public class a1findnum {
    public static void findnum(int matrix[][],int key){
        int count = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    count ++;
                }
            }
        }
        System.out.print("The number "+ key +" is repeated " + count + " time");
    }
    public static void main(String args[]){
        int matrix[][] = { {4,7,8},{8,8,7} };
        int key = 7;

        findnum(matrix,key);
    }
    
}

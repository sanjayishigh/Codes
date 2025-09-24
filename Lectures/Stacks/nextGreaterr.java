import java.util.*;

public class nextGreaterr {

    public static void ngreater(int arr[],int greater[]){
        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1; i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
            s.pop();
            }
            if(s.isEmpty()){
                greater[i] = -1;
            }else{
                greater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        
    }   

    public static void main(String args[]){
        int arr[] = {4, 5, 2, 25, 7, 8};
        int greater[] = new int[arr.length];

        ngreater(arr,greater);

        for(int i=0;i<arr.length; i++){
            System.out.print(greater[i] + " ");
        }

        //next Greater right
        //next Greater left
        //next Smaller right
        //next smaller left
    }    
}

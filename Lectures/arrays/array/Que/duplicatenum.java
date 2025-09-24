// Write a Java program to check if an integer array contains any duplicate elements.
// If duplicates exist, print each element and the number of times it is repeated.
// Finally, return true if duplicates are found, otherwise return false.

// Example:
// Input: {1, 2, 3, 1, 1, 3, 2, 2, 2}
// Output:

// 1 is repeated 3 times  
// 2 is repeated 4 times  
// 3 is repeated 2 times  
// Any duplicates? true


public class duplicatenum {
    public static void duplicate(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean alreadycounted = false;

            for(int k=0; k<i; k++){
                if(arr[k] == arr[i]){
                    alreadycounted = true;
                    break;
                }
            }
            if(alreadycounted) continue;

            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i] +" is repeated " + count +" times");
        }
    }
    public static void main(String[] args){
        int[] arr ={1,2,2,2,1,1,3,4,5,3,4,5};
        duplicate(arr);
    }
}

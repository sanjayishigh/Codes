import java.util.*;

public class test {
    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pidx = partition(arr, si, ei);
        quicksort(arr, si, pidx - 1);
        quicksort(arr, pidx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = -1;

        for (int j = 0; j < ei; j++) {
            if(arr[j]<= pivot){
                i++;

                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //pivot
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String args[]) {
        int arr[] = {6,2,7,8,3,5};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        quicksort(arr, 0, arr.length -1);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }   
}

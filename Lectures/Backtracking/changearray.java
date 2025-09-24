public class changearray {
    public static void changeArr(int arr[], int i, int val) {
    // Base case
    if (i == arr.length) {
        printArr(arr);
        return;
    }

    // Recursion step
    arr[i] = val; // Modify current index
    changeArr(arr, i + 1, val + 1); // Recursive call
    arr[i] = arr[i] - 2; // Backtracking step : Undoing the change for other recursive paths
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = new int[5];
        changeArr(arr,0,1);
        printArr(arr);
    }

}

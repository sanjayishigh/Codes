public class quicksortt {
    public static void quicksort(int arr[], int l, int h) {
        if (l >= h) {
            return;
        }
        int pividx = partition(arr, l, h);
        quicksort(arr, l, pividx - 1);
        quicksort(arr, pividx + 1, h);
    }

    public static int partition(int arr[], int l, int h) {
        int pivot = arr[h];
        int i = l - 1;

        for (int j = l; j < h; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        // swap pivot
        int temp = arr[i];
        arr[i] = arr[h];
        arr[h] = temp;
        return i;

    }

    public static void main(String args[]) {
        int arr[] = { 8, 4, 6, 5, 2, 3, 5, 8 };
        quicksort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

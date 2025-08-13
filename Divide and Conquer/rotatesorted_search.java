public class rotatesorted_search {
    public static int search(int arr[], int target, int l, int h) {
        if (l > h) {
            return -1;
        }
        int mid = l + (h - l) / 2;

        if (target == arr[mid]) {
            return mid;
        }

        // mid on L1
        if (arr[l] <= arr[mid]) {
            // case a: left of mid
            if (arr[l] <= target && target <= arr[mid]) {
                return search(arr, target, l, mid - 1);
            } else { // case b: right of mid
                return search(arr, target, mid + 1, h);
            }
        } else { // mid on L2
            // case c:
            if (arr[mid] <= target && target <= arr[h]) {
                return search(arr, target, mid + 1, h);
            } else { // case d:
                return search(arr, target, l, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.print(search(arr, 0, 0, arr.length - 1));
    }
}
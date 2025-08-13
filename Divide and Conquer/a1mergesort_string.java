public class a1mergesort_string {
    public static String[] mergeSort(String[] arr, int lo, int hi) {
        if (lo == hi) {
            return new String[]{arr[lo]};
        }

        int mid = lo + (hi - lo) / 2;
        String[] left = mergeSort(arr, lo, mid);
        String[] right = mergeSort(arr, mid + 1, hi);

        return merge(left, right);
    }

    static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length, n = arr2.length;
        String[] result = new String[m + n];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < m) result[k++] = arr1[i++];
        while (j < n) result[k++] = arr2[j++];

        return result;
    }

    static boolean isAlphabeticallySmaller(String str1, String str2) {
        if(str1.compareTo(str2)<0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] arr = {"sun", "earth", "mars", "mercury"};
        String[] sorted = mergeSort(arr, 0, arr.length - 1);

        for (String s : sorted) {
            System.out.println(s);
        }
    }
}

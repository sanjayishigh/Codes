public class duplicatenum {
    public static boolean dupnum(int arr[]) {
        boolean hasDuplicates = false;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(arr[i] + " is repeated " + count + " times");
                hasDuplicates = true;
            }
        }

        return hasDuplicates;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 1, 1, 3, 2, 2, 2};
        System.out.println("Any duplicates? " + dupnum(arr));
    }
}

public class subarrayUsingPrefix {

    public static void subarraysum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int start=0;start<n;start++){
            int sum = 0;
            for(int end = start; end<n;end++){
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1,2,3,4,5,6 };
        subarraysum(arr);
    }
}

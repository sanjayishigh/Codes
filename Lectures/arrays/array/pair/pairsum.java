
public class pairsum {

    public static void pairsum(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum = arr[i] + arr[j];
                System.out.println("(" + arr[i] + " " + arr[j] + ")" + " = " + sum);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        pairsum(arr);
    }
}
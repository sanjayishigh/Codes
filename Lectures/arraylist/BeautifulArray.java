import java.util.ArrayList;

public class BeautifulArray {

    public ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        divideConquer(1, 1, res, n);
        return res;
    }

    private void divideConquer(int start, int increment, ArrayList<Integer> res, int n) {
        if (start > n) {
            return;
        }
        if (start + increment > n) {
            res.add(start);
            return;
        }
        // Left branch (odds first)
        divideConquer(start, 2 * increment, res, n);
        // Right branch (evens next)
        divideConquer(start + increment, 2 * increment, res, n);
    }

    public static void main(String[] args) {
        BeautifulArray ba = new BeautifulArray();
        System.out.println(ba.beautifulArray(4)); // Example: [1, 3, 2, 4]
        System.out.println(ba.beautifulArray(5)); // Example: [1, 5, 3, 2, 4]
    }
}

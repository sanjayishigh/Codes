public class modularexponent {

    // Function to calculate (base^exponent) % mod efficiently
    public static int power(int base, int exponent, int mod) {
        int ans = 1;
        base = base % mod;  // In case base > mod

        while (exponent > 0) {
            // If exponent is odd, multiply base with result
            if ((exponent & 1) == 1) {
                ans = (ans * base) % mod;
            }

            // Square the base
            base = (base * base) % mod;

            // Divide the exponent by 2
            exponent = exponent >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int base = 3;
        int exponent = 13;
        int mod = 1000000007;

        System.out.println(power(base, exponent, mod));  // Output: 1594323
    }
}

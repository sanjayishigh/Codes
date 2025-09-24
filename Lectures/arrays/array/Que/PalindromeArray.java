public class PalindromeArray {
    public static boolean isPalindrome(String str,int left,int right) {
        if (left >= right) return true; // base case: all matched
        if (str.charAt(left) != str.charAt(right)) return false; // mismatch
        return isPalindrome(str, left + 1, right - 1); // recurse
    }

    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "java";

        System.out.println(isPalindrome(str1, 0, str1.length()-1));
        System.out.println(isPalindrome(str2, 0, str2.length()-1));
    }
}

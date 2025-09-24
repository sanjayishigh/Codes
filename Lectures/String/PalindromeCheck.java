public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // not palindrome
            }
            left++;
            right--;
        }
        return true; // palindrome
    }

    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "hello";

        System.out.println(str1 + " -> " + isPalindrome(str1)); // true
        System.out.println(str2 + " -> " + isPalindrome(str2)); // false
    }
}

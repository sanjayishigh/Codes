public class PalindromeArray {
    public static boolean isPalindrome(String str) {
        // convert string into char array
        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false; // not palindrome
            }
            left++;
            right--;
        }
        return true; // palindrome
    }

    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "java";

        System.out.println(str1 + " -> " + isPalindrome(str1)); // true
        System.out.println(str2 + " -> " + isPalindrome(str2)); // false
    }
}

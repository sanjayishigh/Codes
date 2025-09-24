import java.util.*;
import java.util.LinkedList;

public class firstnonRepeatingLetter {

    public static void printFirstNonRepeating(String str) {
        // Frequency array for 'a' through 'z'
        int[] freq = new int[26];
        // Queue to store characters in the order they appear
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // 1. Add the current character to the queue and update its frequency
            q.add(ch);
            freq[ch - 'a']++;

            // 2. Remove all repeating characters from the front of the queue
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            // 3. Check the queue to find the answer for the current step
            if (q.isEmpty()) {
                System.out.print("-1 "); // No non-repeating character found yet
            } else {
                System.out.print(q.peek() + " "); // The front is the first non-repeating character
            }
        }
        System.out.println(); // For a clean final output
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        printFirstNonRepeating(str); // Expected Output: b b c c a a
    }
}
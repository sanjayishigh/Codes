// public class a2anagram {

//     public static boolean anagram(String str1,String str2) {
//         StringBuilder sb = new StringBuilder("");

//         for (int i = 0; i < str1.length(); i++) {
//             for (int j = 0; j < str2.length(); j++) {
//                 if(str1.charAt(i)==str2.charAt(j)){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         String str1 = "race";
//         String str2 = "care";
//         System.out.print(anagram(str1,str2));  // Output should be 6
//     }
// }

import java.util.Arrays;

public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        // Normalize strings: remove spaces and convert to lower case
        String normalizedStr1 = str1.toLowerCase();
        String normalizedStr2 = str2.toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (normalizedStr1.length() != normalizedStr2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = normalizedStr1.toCharArray();
        char[] charArray2 = normalizedStr2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";
        
        if (areAnagrams(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
        // Output: Listen and Silent are anagrams.
    }
}
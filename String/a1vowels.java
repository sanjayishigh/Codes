public class a1vowels {

    public static String vowels(String str) {
        StringBuilder sb = new StringBuilder("");
        String vowels = "aeiou";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i)); // handles uppercase too
            for (int j = 0; j < vowels.length(); j++) {
                if (ch == vowels.charAt(j)) {
                    count++;
                    break; // No need to check remaining vowels
                }
            }
        }

        sb.append(count);
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "abcdefghijklmopqrstuvwxyz";
        System.out.print(vowels(str));  // Output should be 6
    }
}

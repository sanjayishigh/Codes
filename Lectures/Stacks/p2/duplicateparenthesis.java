import java.util.*;

public class duplicateparenthesis {
    public static Boolean duplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {  // nothing inside → duplicate
                    return true;
                } else {
                    s.pop(); // remove '('
                }

            } else {
                s.push(ch);
            }
        }
        return false;  // no duplicates found
    }

    public static void main(String args[]) {
        String str = "(((a+b)+c))";

        System.out.println(duplicate(str)); // true
    }
}

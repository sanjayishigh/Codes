public class firstletteruppercase {
    public static String touppercase(String str) {
    StringBuilder sb = new StringBuilder("");

    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i=1; i<str.length(); i++) {
        if(str.charAt(i) == ' ' && i<str.length()-1) {
            sb.append(str.charAt(i)); // append the space
            i++;
            sb.append(Character.toUpperCase(str.charAt(i))); // append the capitalized letter
        } else {
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}

    public static void main(String args[]){
        String str = "i am batman";
        System.out.print(touppercase(str));
    }
    
}

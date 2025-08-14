public class Subset {
    public static void findsubset(String str,String ans,int i){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //Yes choice
        findsubset(str,ans + str.charAt(i),i+1);
        //no choice
        findsubset(str,ans,i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        findsubset(str,"",0);
    }
}

// public class Subset {
//     public static void findSubset(String str, StringBuilder ans, int i) {
//         // Base case
//         if (i == str.length()) {
//             System.out.println(ans.toString());
//             return;
//         }

//         // Yes choice
//         ans.append(str.charAt(i));          // Add character
//         findSubset(str, ans, i + 1);
//         ans.deleteCharAt(ans.length() - 1); // Backtrack (remove last char)

//         // No choice
//         findSubset(str, ans, i + 1);
//     }

//     public static void main(String args[]) {
//         String str = "abc";
//         findSubset(str, new StringBuilder(), 0);
//     }
// }

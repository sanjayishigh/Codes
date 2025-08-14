public class permutationstr {

    public static void perm(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //T(n) = n*n!
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);

            //"abcde" -- "ab" + "de" ; c is at i
            //substring doesnt print the last index n str.substring(0,n) only goes till n-1
            String Newstr = str.substring(0,i) + str.substring(i+1);
            perm(Newstr,ans+curr);
        }
    }

    public static void main(String args[]){
        String str = "abc";
        perm(str,"");
    }
    
}

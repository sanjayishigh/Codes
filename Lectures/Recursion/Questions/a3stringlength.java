public class a3stringlength {
    public static int strlen(String str,int i,int count){
        if(i== str.length()){
            return count;
        }

        return strlen(str,i+1,count+1);
    }
    public static void main(String args[]){
        String str = "iam";
        System.out.print(strlen(str,0,0));
    }
    
}

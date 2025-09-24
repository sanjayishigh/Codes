public class binarystring {
    public static void printbinstr(int n,int lastplace,String str){
        if(n ==0){
            System.out.println(str);
            return;
        }

        // if(lastplace == 0){
        //     printbinstr(n-1,0,str.append("0"));
        //     printbinstr(n-1,1,str.append("1"));   
        // }else{
        //     printbinstr(n-1,0,str.append("0"));
        // }
        
        printbinstr(n-1,0,str+("0"));
        if(lastplace == 0){
            printbinstr(n-1,1,str+("1"));
        }

    }
    public static void main(String args[]){
        int n = 3;
        printbinstr(n,0,"");
    }
    
}

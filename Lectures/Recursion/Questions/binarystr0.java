public class binarystr0 {
    public static void binstr0(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        binstr0(n-1,1,str+"1");
        if(lastplace==1){
            binstr0(n-1,0,str+"0");
        }
    }
    public static void main(String args[]){
        int n = 3;
        binstr0(n,1,"");
    }
    
}

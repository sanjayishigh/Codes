public class fastexponent {
    public static int fastexpo(int a,int n){
        int ans = 1;

        while(n>0){
            if((n&1)==1){ //odd
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;

        }

    //     while(n>0){
    //         if(n%2==1){
    //             ans = ans * a;
    //             n = n-1;
    //         }
    //         else{
    //             a= a*a;
    //             n = n/2;
    //         }
    //     }
        return ans;
    }
    public static void main(String args[]){
        int a = 2;
        int n = 2;
        System.out.print(fastexpo(a,n));
    }
    
}

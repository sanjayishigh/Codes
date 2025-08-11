public class sum {
    public static int sumn(int n){
        if(n==1){
            return 1;
        }
        /*
        int summ = sumn(n-1);
        int sum = n + summ;
         */
        int sum = n + sumn(n-1);
        return sum;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(sumn(n));
    }
}

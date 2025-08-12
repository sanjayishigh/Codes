public class optimisedpower {
    public static int optimisedpow(int x, int n){
        if(n==0){
            return 1;
        }

        int halfpower = optimisedpow(x,n/2);
        int halfpowersq = halfpower*halfpower;

        if(n%2 != 0){
            halfpowersq = x * halfpower;
        }

        return halfpowersq;
    }
    public static void main(String args[]){
        int x = 3;
        int n = 4;
        System.out.print(optimisedpow(x,n));
    }
}

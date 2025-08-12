public class friendpairing {
    public static int pair(int n){
        if(n==1 || n==2){
            return n;
        }

        // int single = pair(n-1);
        // int pair = pair(n-2);
        // int pairway = (n-1)*pair;

        // int totalways = single + pairway;

        return pair(n-1) + (n-1)*pair(n-2);
    }
    public static void main(String args[]){
        int n = 6;
        System.out.print(pair(n));
    }
    
}

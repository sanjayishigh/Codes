public class raintrap{
    public static void raintrapped(int h[]){
        int n = h.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        leftmax[0]= h[0];
        for(int i=1 ;i<=n -1; i++){
            leftmax[i] = Math.max(h[i],leftmax[i-1]);
        }

        rightmax[n-1] = h[n-1];
        for(int i = n-2; i>=0;i--){
            rightmax[i] = Math.max(h[i],rightmax[i+1]);
        }
        int trappedwater =0;
        for(int i=0; i<n;i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trappedwater += waterlevel - h[i];
        }
        System.out.print("Total :" + trappedwater);
    }
    public static void main(String args[]){
        int h[] = {4,2,0,6,3,2,5};
        raintrapped(h);
    }

}
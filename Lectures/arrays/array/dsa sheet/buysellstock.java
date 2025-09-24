// You are given an array price[] where price[i] represents the price of a stock on the i-th day.
// Write a program to find the maximum profit you can achieve by buying on one day and selling on a later day.
// You can only make one transaction (buy once and sell once).
// For example, given price = {7,1,5,3,6,4}, the maximum profit is 5 (buy at 1 and sell at 6).

public class buysellstock{
    public static void buysell(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i=1; i<price.length; i++){
            if(buyprice < price[i]){
                int profit = price[i]-buyprice;
                maxprofit = Math.max(profit,maxprofit);
            }
            else{
                buyprice = price[i];
            }
        }

        System.out.println(maxprofit);
    }
    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};
        buysell(price);
    }

}
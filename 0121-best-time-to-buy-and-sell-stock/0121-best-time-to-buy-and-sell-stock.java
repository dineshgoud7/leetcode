class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int maxprice=prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--){
            int profit=maxprice-prices[i];
            if(profit>maxprofit){
                maxprofit=profit;
            }
            if(prices[i]>maxprice){
                maxprice=prices[i];
            }
        }
        return maxprofit;
    }
}
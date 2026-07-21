class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            if(buy<prices[i])  {
                profit=prices[i]-buy;
                if(profit>maxprofit){
                    maxprofit=profit;
                }
            }
        }
        return maxprofit;
    }
}
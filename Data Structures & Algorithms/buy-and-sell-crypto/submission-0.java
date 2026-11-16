class Solution {
    public int maxProfit(int[] prices) {
     int low=0;
     int high=0;
     int maxProfit=0;
     while(high<prices.length){
        if(prices[high]-prices[low]<0){
            while(low<high){
                low++;
            }
        }
        maxProfit=Math.max(maxProfit,prices[high]-prices[low]);
        high++;
     }
     return  maxProfit;   
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int profit=0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i+1]<minPrice){
                minPrice=prices[i+1];
            }
            if(prices[i+1]-minPrice>profit){
                profit=prices[i+1]-minPrice;
            }
        }
        return profit;
    }
}
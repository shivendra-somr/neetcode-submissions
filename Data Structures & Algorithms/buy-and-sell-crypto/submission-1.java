class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;

        for(int i = 0; i < prices.length - 1; i++){
            int r = i+1;
            while(r < prices.length && prices[r] > prices[i] ){
                maxProfit = Math.max(maxProfit, prices[r] - prices[i]);
                r++;
            }

        }
        return maxProfit;
    }
}

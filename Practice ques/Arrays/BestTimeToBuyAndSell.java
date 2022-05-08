public class BestTimeToBuyAndSell{
    public int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int maxp = 0;
        
        for(int i = 0; i < prices.length; i++){
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i] - minSoFar;
            maxp = Math.max(maxp, profit);
        }
        
        return maxp;
    }
}
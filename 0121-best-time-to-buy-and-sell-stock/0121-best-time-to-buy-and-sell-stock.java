class Solution {
    public int maxProfit(int[] prices)
    {
        // int n = prices.length;
        // int minPrice = Integer.MAX_VALUE;
        // int profit = 0;
        // for (int i = 0 ; i < n; i++)
        // {
        //     if(prices[i] < minPrice)
        //     {
        //         minPrice = prices[i];
        //     }
        //     else if(prices[i]-minPrice > profit)
        //     {
        //         profit = prices[i]-minPrice;
        //     }
        // }
        // return profit;

        int n = prices.length;
        int maxP = 0 ;
        int mini = prices[0];
        for(int i = 1 ; i < n; i++)
        {
            int cost = prices[i] - mini;
            maxP = Math.max(maxP , cost);
            mini = Math.min(mini, prices[i]);
        }
        return maxP;
    }
}
class BestTimeToBuyAndSellStock {
  // problems/best-time-to-buy-and-sell-stock/
    public int maxProfit(int[] prices) {
        if(prices.length < 2)
            return 0;
        int profit = 0;
        int maxProfit = 0;
        int min = prices[0];
        for(int stockPrice : prices){
            min = Math.min(min, stockPrice);
            profit = stockPrice - min;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }
}

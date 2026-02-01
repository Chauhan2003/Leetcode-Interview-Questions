class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int ele : prices) {
            buy = Math.min(ele, buy);
            profit = Math.max(profit, ele-buy);
        }

        return profit;
    }
}
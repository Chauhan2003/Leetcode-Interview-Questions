class Solution {
    public int maxProfit(int[] prices) {
        int minProfit = prices[0];
        int maxProfit = 0;

        for (int num : prices) {
            minProfit = Math.min(minProfit, num);
            maxProfit = Math.max(maxProfit, num - minProfit);
        }

        return maxProfit;
    }
}
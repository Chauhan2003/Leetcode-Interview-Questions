class Solution {
    public int maximumDifference(int[] nums) {
        int buy = nums[0];
        int profit = -1;

        for (int ele : nums) {
            if (ele > buy) {
                profit = Math.max(profit, ele - buy);
            } else {
                buy = Math.min(buy, ele);
            }
        }

        return profit;
    }
}

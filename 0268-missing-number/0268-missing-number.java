class Solution {
    public int missingNumber(int[] nums) {
        int originalSum = nums.length;
        int arraySum = 0;

        for (int i=0;i<nums.length;i++) {
            originalSum += i;
            arraySum += nums[i];
        }

        return originalSum - arraySum;
    }
}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int curr = 0;
        int n = nums.length;
        int i = 0;

        while (i < n) {
            if (nums[i] == 0) {
                res = Math.max(res, curr);
                curr = 0;
                i++;

                continue;
            }

            curr += 1;
            i++;
        }

        if (i == n) {
            res = Math.max(res, curr);
        }

        return res;
    }
}
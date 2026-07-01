class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int l = 0;
        int r = n-1;

        while (l <= r) {
            if (nums[l] == val && nums[r] != val) {
                swap(nums, l, r);
            } else if (nums[l] == val && nums[r] == val) {
                r--;
            } else {
                l++;
            }
        }

        return l;
    }

    public static void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}
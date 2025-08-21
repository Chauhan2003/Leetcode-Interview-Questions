class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;

        // Step 1: find the first decreasing element from right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // If no such element found -> reverse whole array
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 2: find element just greater than nums[index] from right side
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // Step 3: reverse the suffix
        reverse(nums, index + 1, n - 1);
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

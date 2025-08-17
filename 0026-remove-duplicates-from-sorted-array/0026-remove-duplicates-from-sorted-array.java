class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }

        int x=0;
        for (int ele : set) {
            nums[x++] = ele;
        }

        return set.size();
    }
}
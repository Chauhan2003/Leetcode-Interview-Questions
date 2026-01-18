class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<n;i++) {
            int val = target - nums[i];
            if (map.containsKey(val)) {
                res[0] = map.get(val);
                res[1] = i;

                return res;
            }

            map.put(nums[i], i);
        }

        res[0] = -1;
        res[1] = -1;

        return res;
    }
}
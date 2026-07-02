class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i=0;i<n;i++) {
            int ele = nums[i];

            map.put(ele, map.getOrDefault(ele, 0) + 1);

            if (map.get(ele) > n/2) {
                return ele;
            }
        }
        
        return -1;
    }
}
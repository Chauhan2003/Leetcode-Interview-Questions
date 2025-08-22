class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int idx = 0;

        if (map.containsKey(0)) {
            int count = map.get(0);
            for (int i = 0; i < count; i++) {
                nums[idx++] = 0;
            }
        }

        if (map.containsKey(1)) {
            int count = map.get(1);
            for (int i = 0; i < count; i++) {
                nums[idx++] = 1;
            }
        }

        if (map.containsKey(2)) {
            int count = map.get(2);
            for (int i = 0; i < count; i++) {
                nums[idx++] = 2;
            }
        }
    }
}

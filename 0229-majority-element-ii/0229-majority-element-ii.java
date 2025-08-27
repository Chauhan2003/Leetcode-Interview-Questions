class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > n/3) {
                if (!res.contains(num)) {
                    res.add(num);
                }
            }
        }

        return res;
    }
}
import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] arr = new int[n - k + 1]; // ✅ correct size
        int mainCounter = 0;

        for (int i = 0; i <= n - k; i++) { // ✅ use <=
            Map<Integer, Integer> map = new HashMap<>();

            // Count frequencies in current window
            for (int j = i; j < i + k; j++) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            }

            // Max-heap sorted by (freq desc, value desc)
            PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> {
                    if (!a.getValue().equals(b.getValue()))
                        return b.getValue() - a.getValue(); // higher freq first
                    return b.getKey() - a.getKey(); // higher value first
                });

            pq.addAll(map.entrySet());

            int curSum = 0;
            int count = 0;

            // Pick top x
            while (!pq.isEmpty() && count < x) {
                Map.Entry<Integer, Integer> curEntry = pq.poll();
                curSum += curEntry.getKey() * curEntry.getValue();
                count++;
            }

            arr[mainCounter++] = curSum;
        }

        return arr;
    }
}

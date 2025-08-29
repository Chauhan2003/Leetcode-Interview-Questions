class Solution {
    class Pair {
        int diff;
        int ele;

        Pair(int diff, int ele) {
            this.diff = diff;
            this.ele = ele;
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> {
            if (b.diff != a.diff) return b.diff - a.diff;
            return b.ele - a.ele;
        });
        for (int element : arr) {
            maxHeap.offer(new Pair(Math.abs(element - x), element));
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        List<Integer> res = new ArrayList<>();
        while(!maxHeap.isEmpty()) {
            res.add(maxHeap.poll().ele);
        }

        Collections.sort(res);
        return res;
    }
}
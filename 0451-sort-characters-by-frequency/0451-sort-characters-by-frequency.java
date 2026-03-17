class Pair {
    public char key;
    public int value;

    public Pair(char key, int value) {
        this.key = key;
        this.value = value;
    }
}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.value - a.value);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.offer(new Pair(entry.getKey(), entry.getValue()));
        }

        StringBuilder result = new StringBuilder();

        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            for (int i = 0; i < p.value; i++) {
                result.append(p.key);
            }
        }

        return result.toString();
    }
}
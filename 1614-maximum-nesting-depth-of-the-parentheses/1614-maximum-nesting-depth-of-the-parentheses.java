class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int counter = 0;

        // Result
        int depth = 0;

        for (int i=0;i<n;i++) {
            if (s.charAt(i) =='(') {
                counter++;
            } else if (s.charAt(i) == ')') {
                depth = Math.max(counter, depth);
                counter--;
            }
        }

        return depth;
    }
}
class Solution {
    public int findClosest(int x, int y, int z) {
        int p1Diff = Math.abs(z-x);
        int p2Diff = Math.abs(z-y);

        if (p1Diff < p2Diff) {
            return 1;
        } else if (p1Diff > p2Diff) {
            return 2;
        }

        return 0;
    }
}
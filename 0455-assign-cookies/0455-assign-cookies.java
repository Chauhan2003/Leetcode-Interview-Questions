class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int grid = 0;
        int cookie = 0;

        while (grid < g.length && cookie < s.length) {
            if (s[cookie] >= g[grid]) {
                grid++;
            }

            cookie++;
        }

        return grid;
    }
}
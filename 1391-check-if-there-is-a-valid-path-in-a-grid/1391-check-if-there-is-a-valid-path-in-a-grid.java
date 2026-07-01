class Solution {
    Map<Integer, int[][]> map = new HashMap<>();
    boolean[][] visited;
    int m, n;

    public boolean hasValidPath(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        visited = new boolean[m][n];

        // Street type -> possible directions
        map.put(1, new int[][]{{0, -1}, {0, 1}});   // left, right
        map.put(2, new int[][]{{-1, 0}, {1, 0}});   // up, down
        map.put(3, new int[][]{{0, -1}, {1, 0}});   // left, down
        map.put(4, new int[][]{{0, 1}, {1, 0}});    // right, down
        map.put(5, new int[][]{{0, -1}, {-1, 0}});  // left, up
        map.put(6, new int[][]{{0, 1}, {-1, 0}});   // right, up

        return dfs(grid, 0, 0);
    }

    public boolean dfs(int[][] grid, int r, int c) {
        if (r == m-1 && c == n-1) {
            return true;
        }

        visited[r][c] = true;

        for (int[] direction : map.get(grid[r][c])) {
            int newRow = r + direction[0];
            int newCol = c + direction[1];

            if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n || visited[newRow][newCol]) {
                continue;
            }

            for (int neighbourDirection[] : map.get(grid[newRow][newCol])) {
                if (newRow + neighbourDirection[0] == r && newCol + neighbourDirection[1] == c) {
                    if (dfs(grid, newRow, newCol)) {
                        return true;
                    }

                    break;
                }
            }
        }

        return false;
    }
}
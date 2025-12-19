class Solution {

    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adjList = convertMatrixToList(isConnected);
        boolean[] visited = new boolean[isConnected.length];

        int provinces = 0;

        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                dfs(i, adjList, visited);
                provinces++;   // one DFS = one province
            }
        }
        return provinces;
    }

    // DFS to mark all connected nodes
    private void dfs(int node, ArrayList<ArrayList<Integer>> adjList, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adjList, visited);
            }
        }
    }

    // Matrix → Adjacency List
    private ArrayList<ArrayList<Integer>> convertMatrixToList(int[][] isConnected) {
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adjList.get(i).add(j);
                }
            }
        }
        return adjList;
    }
}
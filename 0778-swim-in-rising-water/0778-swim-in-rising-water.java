class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]); 
        pq.offer(new int[]{0, 0, grid[0][0]});
        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        int res = 0;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int i = curr[0], j = curr[1], elev = curr[2];
            res = Math.max(res, elev);
            if (i == n - 1 && j == n - 1) return res;
            if (visited[i][j]) continue;
            visited[i][j] = true;

            for (int[] dir : dirs) {
                int ni = i + dir[0], nj = j + dir[1];
                if (ni >= 0 && nj >= 0 && ni < n && nj < n && !visited[ni][nj]) {
                    pq.offer(new int[]{ni, nj, grid[ni][nj]});
                }
            }
        }

        return -1; 
    }
}

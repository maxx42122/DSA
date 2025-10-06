class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        int left = 0, right = 1_000_000; // max possible effort

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canReach(heights, mid, m, n)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canReach(int[][] heights, int maxEffort, int m, int n) {
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int i = curr[0], j = curr[1];
            if (i == m - 1 && j == n - 1) return true;

            for (int[] dir : dirs) {
                int ni = i + dir[0], nj = j + dir[1];
                if (ni >= 0 && nj >= 0 && ni < m && nj < n && !visited[ni][nj]) {
                    int diff = Math.abs(heights[ni][nj] - heights[i][j]);
                    if (diff <= maxEffort) {
                        visited[ni][nj] = true;
                        queue.offer(new int[]{ni, nj});
                    }
                }
            }
        }

        return false;
    }
}

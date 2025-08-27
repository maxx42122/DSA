class Solution {
  public int lenOfVDiagonal(int[][] grid) {
    final int m = grid.length, n = grid[0].length;
    // mem[i][j][turned(0/1)][expectedHash(0 for 1->2, 1 for ->0)][dir(0..3)]
    Integer[][][][][] mem = new Integer[m][n][2][2][4];
    int ans = 0;

    for (int i = 0; i < m; ++i)
      for (int j = 0; j < n; ++j)
        if (grid[i][j] == 1)
          for (int d = 0; d < 4; ++d) {
            int ni = i + DIRS[d][0], nj = j + DIRS[d][1];
            ans = Math.max(ans, 1 + dfs(grid, ni, nj, false, 2, d, mem));
          }

    return ans;
  }

  // ↗, ↘, ↙, ↖ (clockwise order to enable a single clockwise turn)
  private static final int[][] DIRS = { {-1, 1}, {1, 1}, {1, -1}, {-1, -1} };

  private int dfs(int[][] g, int i, int j, boolean turned, int expect, int dir,
                  Integer[][][][][] mem) {
    if (i < 0 || i >= g.length || j < 0 || j >= g[0].length) return 0;
    if (g[i][j] != expect) return 0;

    int t = turned ? 1 : 0;
    int hash = Math.max(0, expect - 1); // map expect=2->1, expect=0->0
    if (mem[i][j][t][hash][dir] != null) return mem[i][j][t][hash][dir];

    int next = (expect == 2) ? 0 : 2;

    // keep going straight
    int best = 1 + dfs(g, i + DIRS[dir][0], j + DIRS[dir][1], turned, next, dir, mem);

    // take the single allowed clockwise turn (dir -> (dir+1)%4)
    if (!turned) {
      int nd = (dir + 1) % 4;
      best = Math.max(best,
          1 + dfs(g, i + DIRS[nd][0], j + DIRS[nd][1], true, next, nd, mem));
    }

    return mem[i][j][t][hash][dir] = best;
  }
}

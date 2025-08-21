class Solution {
    public int numSubmat(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[][] width = new int[m][n];
        int count = 0;

        // Step 1: Precompute width of consecutive 1s ending at each cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    width[i][j] = (j == 0 ? 0 : width[i][j - 1]) + 1;
                }
            }
        }

        // Step 2: For each cell, look upward and count valid submatrices
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                int minWidth = width[i][j];
                for (int k = i; k >= 0 && minWidth > 0; k--) {
                    minWidth = Math.min(minWidth, width[k][j]);
                    count += minWidth;
                }
            }
        }

        return count;
    }
}

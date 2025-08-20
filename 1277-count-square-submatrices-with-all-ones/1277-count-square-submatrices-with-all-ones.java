class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;

        // Traverse the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Only update if the cell is 1 and not on the first row or column
                if (matrix[i][j] == 1 && i > 0 && j > 0) {
                    matrix[i][j] = Math.min(
                        Math.min(matrix[i-1][j], matrix[i][j-1]),
                        matrix[i-1][j-1]
                    ) + 1;
                }
             
                count += matrix[i][j];
            }
        }

        return count;
    }
}

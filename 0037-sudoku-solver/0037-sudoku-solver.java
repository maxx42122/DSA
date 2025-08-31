class Solution {
    private int[] row = new int[9];
    private int[] col = new int[9];
    private int[] box = new int[9];
    private int[][] empties = new int[81][];
    private int emptyCount = 0;

    public void solveSudoku(char[][] board) {
        // Initialize masks and collect empties
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if (ch == '.') {
                    empties[emptyCount++] = new int[]{r, c};
                } else {
                    int d = ch - '1';
                    int bit = 1 << d;
                    int b = (r / 3) * 3 + (c / 3);
                    row[r] |= bit;
                    col[c] |= bit;
                    box[b] |= bit;
                }
            }
        }
        backtrack(board, 0);
    }

    private boolean backtrack(char[][] board, int idx) {
        if (idx == emptyCount) return true;

        // MRV: choose the position with the fewest candidates among [idx..end)
        int best = idx, bestMask = 0, bestCount = 10;
        for (int i = idx; i < emptyCount; i++) {
            int r = empties[i][0], c = empties[i][1];
            int b = (r / 3) * 3 + (c / 3);
            int mask = ~(row[r] | col[c] | box[b]) & 0x1FF;
            int cnt = Integer.bitCount(mask);
            if (cnt < bestCount) {
                best = i; bestMask = mask; bestCount = cnt;
                if (cnt == 1) break; // can't do better
            }
        }
        if (bestCount == 0) return false;

        // swap chosen empty with current idx
        int[] tmp = empties[idx]; empties[idx] = empties[best]; empties[best] = tmp;
        int r = empties[idx][0], c = empties[idx][1];
        int b = (r / 3) * 3 + (c / 3);
        int mask = bestMask;

        // try all candidates
        while (mask != 0) {
            int pick = mask & -mask;          // lowest set bit
            int d = Integer.numberOfTrailingZeros(pick); // 0..8
            place(board, r, c, b, d);
            if (backtrack(board, idx + 1)) return true;
            unplace(board, r, c, b, d);
            mask &= mask - 1;                 // remove this bit
        }
        // backtrack: restore order not necessary
        return false;
    }

    private void place(char[][] board, int r, int c, int b, int d) {
        int bit = 1 << d;
        row[r] |= bit; col[c] |= bit; box[b] |= bit;
        board[r][c] = (char) ('1' + d);
    }

    private void unplace(char[][] board, int r, int c, int b, int d) {
        int bit = 1 << d;
        row[r] ^= bit; col[c] ^= bit; box[b] ^= bit;
        board[r][c] = '.';
    }
}

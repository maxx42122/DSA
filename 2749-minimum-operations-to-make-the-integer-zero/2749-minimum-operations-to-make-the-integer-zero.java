class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (long k = 0; k <= 60; ++k) {
            long S = (long)num1 - k * (long)num2;
            if (S < k) continue;                // must be at least k (minimum sum of k ones)
            // count of 1-bits in S
            if (Long.bitCount(S) <= k) return (int)k;
        }
        return -1;
    }
}

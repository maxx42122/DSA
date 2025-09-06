class Solution {
    // Function to calculate the operations needed to reduce all numbers from 1 to n
    private long opsToZero(long n) {
        if (n <= 0) return 0;
        long res = 0;
        long ops = 0;
        long power = 1;

        while (power <= n) {
            long l = power;
            long r = Math.min(n, power * 4 - 1);
            ops++;
            res += (r - l + 1) * ops;
            power *= 4;
        }
        return res;
    }

    public long minOperations(int[][] queries) {
        long total = 0;
        for (int[] q : queries) {
            int l = q[0], r = q[1];
            total += (opsToZero(r) - opsToZero(l - 1) + 1) / 2;
        }
        return total;
    }
}

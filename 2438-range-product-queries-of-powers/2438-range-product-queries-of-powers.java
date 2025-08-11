import java.util.*;

class Solution {
    private static final int MOD = 1_000_000_007;

    public int[] productQueries(int n, int[][] queries) {
        // Step 1: Build powers array from binary representation of n
        List<Integer> powersList = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            if ((n & (1 << i)) != 0) {
                powersList.add(1 << i);
            }
        }

        // Step 2: Precompute prefix products
        int[] prefix = new int[powersList.size()];
        prefix[0] = powersList.get(0);
        for (int i = 1; i < powersList.size(); i++) {
            prefix[i] = (int)((1L * prefix[i - 1] * powersList.get(i)) % MOD);
        }

        // Step 3: Answer each query using prefix products
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            if (left == 0) {
                result[i] = prefix[right];
            } else {
                result[i] = (int)((1L * prefix[right] * modInverse(prefix[left - 1])) % MOD);
            }
        }

        return result;
    }

    // Modular inverse using Fermat's Little Theorem
    private int modInverse(int x) {
        return modPow(x, MOD - 2);
    }

    private int modPow(int base, int exp) {
        long result = 1;
        long b = base;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * b) % MOD;
            }
            b = (b * b) % MOD;
            exp >>= 10;
        }
        return (int) result;
    }
}

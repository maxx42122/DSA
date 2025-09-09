class Solution {
    private static final int MOD = 1_000_000_007;
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long[] dp = new long[n + 1];
        dp[1] = 1;
        long window = 0; // sum of dp[j] for j in [i-forget+1, i-delay]

        for (int i = 2; i <= n; i++) {
            if (i - delay >= 1) {
                window = (window + dp[i - delay]) % MOD;
            }
            if (i - forget >= 1) {
                window = (window - dp[i - forget]) % MOD;
                if (window < 0) window += MOD;
            }
            dp[i] = window;
        }

        long ans = 0;
        int start = Math.max(1, n - forget + 1);
        for (int j = start; j <= n; j++) {
            ans = (ans + dp[j]) % MOD;
        }
        return (int) ans;
    }
}

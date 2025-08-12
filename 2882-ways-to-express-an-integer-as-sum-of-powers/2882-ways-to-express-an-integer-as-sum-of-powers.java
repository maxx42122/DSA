class Solution {
  
         static final int MOD = 1_000_000_007;
    Map<String, Integer> memo = new HashMap<>();

    public int numberOfWays(int n, int x) {
        return dfs(n, 1, x);
    }

    private int dfs(int remaining, int base, int power) {
        String key = remaining + "," + base;
        if (memo.containsKey(key)) return memo.get(key);
        int val = (int) Math.pow(base, power);
        if (val > remaining) return 0;
        if (val == remaining) return 1;

        // Include current base or skip it
        int include = dfs(remaining - val, base + 1, power);
        int skip = dfs(remaining, base + 1, power);

        int total = (include + skip) % MOD;
        memo.put(key, total);
        return total;
    
        
    }
}
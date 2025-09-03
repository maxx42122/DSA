import java.util.*;

class Solution {
    public int numberOfPairs(int[][] points) {
        // Step 1: Sort by x ascending, and if x is same, y descending
        Arrays.sort(points, (a, b) -> 
            a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]
        );

        int n = points.length;
        int ans = 0;

        // Step 2: For each point as Alice
        for (int i = 0; i < n; i++) {
            int yi = points[i][1];
            int maxY = Integer.MIN_VALUE;

            // Step 3: Check all later points as Bob
            for (int j = i + 1; j < n; j++) {
                int yj = points[j][1];
                // Bob must be below Alice but above last maxY
                if (maxY < yj && yj <= yi) {
                    ans++;
                    maxY = yj;
                }
            }
        }
        return ans;
    }
}

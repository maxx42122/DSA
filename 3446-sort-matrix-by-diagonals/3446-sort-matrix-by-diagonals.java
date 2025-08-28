class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        Map<Integer, List<Integer>> diagMap = new HashMap<>();

        // Step 1: Collect elements by diagonal (i - j)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                diagMap.computeIfAbsent(key, k -> new ArrayList<>()).add(grid[i][j]);
            }
        }

        // Step 2: Sort each diagonal based on its position
        for (Map.Entry<Integer, List<Integer>> entry : diagMap.entrySet()) {
            List<Integer> list = entry.getValue();
            if (entry.getKey() >= 0) {
                list.sort(Collections.reverseOrder()); // bottom-left: non-increasing
            } else {
                Collections.sort(list); // top-right: non-decreasing
            }
        }

        // Step 3: Refill the matrix using sorted diagonals
        Map<Integer, Integer> diagIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                int idx = diagIndex.getOrDefault(key, 0);
                grid[i][j] = diagMap.get(key).get(idx);
                diagIndex.put(key, idx + 1);
            }
        }

        return grid;
    }
}

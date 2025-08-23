class Solution {
    public int minimumSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
  List<int[]> ones = new ArrayList<>();
for (int i = 0; i < m; i++)
    for (int j = 0; j < n; j++)
        if (grid[i][j] == 1)
            ones.add(new int[]{i, j});

if (ones.size() <= 3) return ones.size();


        int minArea = Integer.MAX_VALUE;
        List<Set<int[]>> rectangles = generateRectangles(grid, ones);

        // Try all combinations of 3 rectangles
        for (int i = 0; i < rectangles.size(); i++) {
            for (int j = i + 1; j < rectangles.size(); j++) {
                for (int k = j + 1; k < rectangles.size(); k++) {
                    Set<int[]> union = new HashSet<>();
                    union.addAll(rectangles.get(i));
                    union.addAll(rectangles.get(j));
                    union.addAll(rectangles.get(k));
                    if (union.size() == ones.size()) {
                        int area = getArea(rectangles.get(i)) +
                                   getArea(rectangles.get(j)) +
                                   getArea(rectangles.get(k));
                        minArea = Math.min(minArea, area);
                    }
                }
            }
        }
        return minArea == Integer.MAX_VALUE ? -1 : minArea;
    }

    List<Set<int[]>> generateRectangles(int[][] grid, List<int[]> ones) {
        List<Set<int[]>> result = new ArrayList<>();
        int m = grid.length, n = grid[0].length;
        for (int r1 = 0; r1 < m; r1++) {
            for (int r2 = r1; r2 < m; r2++) {
                for (int c1 = 0; c1 < n; c1++) {
                    for (int c2 = c1; c2 < n; c2++) {
                        Set<int[]> box = new HashSet<>();
                        for (int[] p : ones) {
                            int r = p[0], c = p[1];
                            if (r >= r1 && r <= r2 && c >= c1 && c <= c2)
                                box.add(p);
                        }
                        if (!box.isEmpty())
                            result.add(box);
                    }
                }
            }
        }
        return result;
    }

    int getArea(Set<int[]> points) {
        int minR = Integer.MAX_VALUE, maxR = Integer.MIN_VALUE;
        int minC = Integer.MAX_VALUE, maxC = Integer.MIN_VALUE;
        for (int[] p : points) {
            minR = Math.min(minR, p[0]);
            maxR = Math.max(maxR, p[0]);
            minC = Math.min(minC, p[1]);
            maxC = Math.max(maxC, p[1]);
        }
        return (maxR - minR + 1) * (maxC - minC + 1);
    }
}

import java.util.*;

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> list = new ArrayList<>();

        // Use a map to merge values
        Map<Integer, Integer> map = new HashMap<>();

        // Add items from items1
        for (int i = 0; i < items1.length; i++) {
            int k = items1[i][0];
            int v = items1[i][1];
            map.put(k, map.getOrDefault(k, 0) + v);
        }

        // Add items from items2
        for (int j = 0; j < items2.length; j++) {
            int k = items2[j][0];
            int v = items2[j][1];
            map.put(k, map.getOrDefault(k, 0) + v);
        }

        // Convert map to list and sort by key
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }

        list.sort((a, b) -> a.get(0) - b.get(0));

        return list;
    }
}

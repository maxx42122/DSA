import java.util.*;

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] res = new int[n];
        Map<Integer, Integer> lakeToLastRain = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
                res[i] = 1; // default value, will be updated if needed
            } else {
                int lake = rains[i];
                if (lakeToLastRain.containsKey(lake)) {
                    int lastRainDay = lakeToLastRain.get(lake);
                    Integer dryDay = dryDays.higher(lastRainDay);
                    if (dryDay == null) return new int[0]; // flood is unavoidable
                    res[dryDay] = lake;
                    dryDays.remove(dryDay);
                }
                lakeToLastRain.put(lake, i);
                res[i] = -1;
            }
        }

        return res;
    }
}

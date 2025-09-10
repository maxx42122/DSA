import java.util.*;

class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        List<Set<Integer>> langSets = new ArrayList<>();
        for (int[] personLangs : languages) {
            Set<Integer> set = new HashSet<>();
            for (int lang : personLangs) {
                set.add(lang);
            }
            langSets.add(set);
        }

        Set<Integer> candidates = new HashSet<>();
        for (int[] f : friendships) {
            int u = f[0] - 1; 
            int v = f[1] - 1;
            if (Collections.disjoint(langSets.get(u), langSets.get(v))) {
                candidates.add(u);
                candidates.add(v);
            }
        }

        if (candidates.isEmpty()) return 0;

        int[] freq = new int[n + 1]; 
        for (int person : candidates) {
            for (int lang : langSets.get(person)) {
                freq[lang]++;
            }
        }


        int maxKnown = 0;
        for (int count : freq) {
            maxKnown = Math.max(maxKnown, count);
        }

        return candidates.size() - maxKnown;
    }
}

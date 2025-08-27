import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        // Convert int[] to Integer[] for custom sorting
        Integer[] boxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(boxed, (a, b) -> {
            int fa = freq.get(a), fb = freq.get(b);
            if (fa != fb) return fa - fb;  // lower frequency first
            return b - a;                  // higher value first if same frequency
        });

        // Convert back to int[]
        for (int i = 0; i < nums.length; i++)
            nums[i] = boxed[i];

        return nums;
    }
}

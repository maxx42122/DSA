class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequency of nums[i] % value (handling negatives)
        for (int num : nums) {
            int mod = ((num % value) + value) % value;
            frequencyMap.put(mod, frequencyMap.getOrDefault(mod, 0) + 1);
        }

        // Find the smallest MEX
        int mex = 0;
        while (true) {
            int mod = mex % value;
            if (!frequencyMap.containsKey(mod) || frequencyMap.get(mod) == 0) {
                break;
            }
            frequencyMap.put(mod, frequencyMap.get(mod) - 1);
            mex++;
        }

        return mex;
    }
}

class Solution {
    public int longestBalanced(int[] nums) {

 
        int n = nums.length;
        
        Map<Integer, Integer> last = new HashMap<>();
        Map<Integer, Integer> firstIndex = new HashMap<>();
        
        int diff = 0;
        int maxLen = 0;
        
        firstIndex.put(0, -1);
        
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            
            // If first occurrence globally
            if (!last.containsKey(num)) {
                if (num % 2 == 0) diff++;
                else diff--;
            }
            
            last.put(num, i);
            
            if (firstIndex.containsKey(diff)) {
                maxLen = Math.max(maxLen, i - firstIndex.get(diff));
            } else {
                firstIndex.put(diff, i);
            }
        }
        
        return maxLen;
    }
}

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];

            // Maintain decreasing stack
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }

            // If stack is empty, there's no greater element
            int nextGreater = stack.isEmpty() ? -1 : stack.peek();
            map.put(num, nextGreater);

            // Push current number onto stack
            stack.push(num);
        }

        // Build result for nums1 based on the map
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}

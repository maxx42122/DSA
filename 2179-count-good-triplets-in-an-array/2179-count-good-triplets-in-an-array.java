class Solution {
    public long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;

        // Step 1: Position mapping for nums2
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[nums2[i]] = i;
        }

        // Step 2: Transform nums1 using positions from nums2
        int[] transformed = new int[n];
        for (int i = 0; i < n; i++) {
            transformed[i] = pos[nums1[i]];
        }

        // Fenwick Tree initialization
        FenwickTree leftTree = new FenwickTree(n); // counts of elements before j
        FenwickTree rightTree = new FenwickTree(n); // counts of elements after j

        // Fill rightTree with counts of all elements
        for (int x : transformed) {
            rightTree.update(x, 1);
        }

        long res = 0;
        for (int j = 0; j < n; j++) {
            int mid = transformed[j];
            rightTree.update(mid, -1); // Remove current from right
            long leftCount = leftTree.query(mid - 1);   // nums less than mid to the left
            long rightCount = rightTree.query(n - 1) - rightTree.query(mid); // nums greater than mid to the right
            res += leftCount * rightCount;
            leftTree.update(mid, 1); // Add current to left
        }

        return res;
    }

    class FenwickTree {
        int[] bit;

        FenwickTree(int size) {
            bit = new int[size + 1];
        }

        void update(int index, int val) {
            index++;
            while (index < bit.length) {
                bit[index] += val;
                index += index & -index;
            }
        }

        int query(int index) {
            index++;
            int sum = 0;
            while (index > 0) {
                sum += bit[index];
                index -= index & -index;
            }
            return sum;
        }
    }
}

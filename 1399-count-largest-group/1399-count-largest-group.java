import java.util.*;

class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency of each digit sum
        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        // Find the maximum group size
        int maxSize = 0;
        for (int size : map.values()) {
            maxSize = Math.max(maxSize, size);
        }

        // Count how many groups have the maximum size
        int count = 0;
        for (int size : map.values()) {
            if (size == maxSize) count++;
        }

        return count;
    }

    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

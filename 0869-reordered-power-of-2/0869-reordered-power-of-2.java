class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] count = countDigits(n);
        
        for (int i = 0; i < 31; i++) {
            int powerOfTwo = 1 << i;
            if (sameDigitCount(count, countDigits(powerOfTwo))) {
                return true;
            }
        }
        return false;
    }

    private int[] countDigits(int n) {
        int[] count = new int[10];
        while (n > 0) {
            count[n % 10]++;
            n /= 10;
        }
        return count;
    }

    private boolean sameDigitCount(int[] a, int[] b) {
        for (int i = 0; i < 10; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}

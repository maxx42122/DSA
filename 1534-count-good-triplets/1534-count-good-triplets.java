class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {

       
            int count = 0;
        int n = arr.length;

        // Iterate through all possible indices i, j, k such that i < j < k
        for (int i = 0; i <= n-3; i++) {
            for (int j = i + 1; j <= n-2; j++) {
                // Check the first condition. We can skip the inner loop if it fails.
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k <= n-1; k++) {
                        // Check the remaining two conditions
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;      
    }
}
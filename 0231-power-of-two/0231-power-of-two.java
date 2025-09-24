class Solution {
    public boolean isPowerOfTwo(int n) {
          System.out.println(n);
          if (n == 1) return true;        // base case: 2^0 = 1
        if (n <= 0 || n % 2 != 0) return false;
       
      
         return isPowerOfTwo( n/2);
        
    }
}
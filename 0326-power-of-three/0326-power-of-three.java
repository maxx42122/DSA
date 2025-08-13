class Solution {
     public boolean isPowerOfThree(int n) {
      int x=1162261467;
       if(n==0)return false;
        if(x%n==0 && n>0){
            return true;
        }

        return false;
  
        
    }
}
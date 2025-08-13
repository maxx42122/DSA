class Solution {
     public boolean isPowerOfThree(int n) {
      int dig=0;
        while(n>0){
               dig+=(n%3);
               if(n==1 && dig==1)return true;             
                n/=3;

        }
     
        return false;
        
    }
}
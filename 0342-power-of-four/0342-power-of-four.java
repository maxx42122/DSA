class Solution {
   public boolean isPowerOfFour(int n) {
        if(n==1)return true;
       int dig=0;
        while(n>0){
               dig+=(n%4);
               if(n==1 && dig==1)return true;
                n/=4;
        }
        return false;
    }
}
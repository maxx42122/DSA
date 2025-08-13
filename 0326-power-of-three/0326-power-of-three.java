class Solution {
     public boolean isPowerOfThree(int n) {
        int dig=0;
        while(n!=0){
            dig+=n%3;
            n/=3;
        }
        if(dig==1 && n==0){
            return true;
        }

        return false;
  
        
    }
}
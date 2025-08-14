class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int m=0;

        while(x>0){
            int dig=x%10;
  m=(10*m)+dig;
              x/=10;

        }
        if(m==n){
            return true;
        }
        return false;
    }
}
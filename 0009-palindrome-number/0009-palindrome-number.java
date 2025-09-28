class Solution {
    public boolean isPalindrome(int x) {

        if(x>=0 && x==rev(x)){
            return true;

        }
        return false;


        
    }

    int rev(int x){
        int num=0;
        while(x>0){
            int dig=x%10;
            num=(num*10)+dig;
            x/=10;

        }
        return num;
    }
}
class Solution {
    public boolean isHappy(int n) {
     

        while(n!=1){
            int y=sumnum(n);
            n=y;

            if(y==4)return false;

        }
        if(n==1)return true;
        return false;
        
    }

    private int sumnum(int num){
           int dig=0;
        while(num!=0){
             dig+=(num%10) *( num%10);
            num/=10;
        }
        return dig;
    }
}
class Solution {
    public boolean isSameAfterReversals(int num) {
        int y=num;
         long num2=0;
        while(y!=0){
            num2=num2*10+y%10;
            y=y/10;
        }
        

          long num1=0;
        while(num2!=0){
            num1=num1*10+num2%10;
            num2=num2/10;
        }

        if(num1==num){
            return true;
        }

        //  if( num> Integer.MAX_VALUE || num< Integer.MIN_VALUE){
        //     return 0;
        //  }

        return false;
        
    }
}
class Solution {
    public int reverse(int x) {
      
       long num=0;
      
      int y = Math.abs(x);
       
        
        while(y!=0){
            int dig=y%10;
            num*=10;
            num+=dig;
            y=y/10;

        }

         if( num> Integer.MAX_VALUE || num< Integer.MIN_VALUE){
            return 0;
        }
         else if(x<0){
            return(int) -num;
        }
        return(int) num;
        
    }
}
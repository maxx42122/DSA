class Solution {
    public int reverse(int x) {
       long num=0;
        while(x!=0){
            int dig=x%10;
            num=num*10+dig;
            x=x/10;
        }

         if( num> Integer.MAX_VALUE || num< Integer.MIN_VALUE){
            return 0;
         }
        return(int) num;
        
    }
}
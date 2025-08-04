class Solution {
    public int reverse(int x) {
      
       long num=0;
      
    
       
        
        while(x!=0){
            int dig=x%10;
            num*=10;
            num+=dig;
            x=x/10;

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
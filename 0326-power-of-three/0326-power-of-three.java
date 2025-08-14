class Solution {
     public boolean isPowerOfThree(int n) {
      
       // return   n>0 && 1162261467%n==0;
       
   if(n<1){
            return false;
        }else if(n==1){
            return true;
        }else{

        while(n%3==0){
            n=n/3;
        }
        if(n==1){
            return true;
        }else{
            return false;
        }
        }  
        
    }
}
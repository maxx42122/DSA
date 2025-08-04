class Solution {
    public int bulbSwitch(int n) {
        if(n==1)return 1;

        for(int i=1;i<n;i++){
         int   x=i*i;
            if(x>n){
               
                return i-1;
             
            }
        }

        
     
            return 1;

       
        
    }
}
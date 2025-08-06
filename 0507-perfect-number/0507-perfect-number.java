class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
         if(num%2 != 0)  return false;

        for(int i=2;i<num/2+1;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        

        if(num==sum)return true;
        return false;
        
    }
   
}
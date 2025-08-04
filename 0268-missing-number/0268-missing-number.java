class Solution {
    public int missingNumber(int[] nums) {
      
        int n=nums.length;
        int fact=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
        sum+=nums[i];            
        }

     
        return fact-sum;
      

        
    }
}
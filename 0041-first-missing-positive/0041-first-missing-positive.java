class Solution {
    public int firstMissingPositive(int[] nums) {

          int n=nums.length;
        
         int i=0;
        while(i<nums.length){
               int j=nums[i]-1;
            if(nums[i]>0 && nums[i]<=n && nums[i]!=nums[j]){              
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                }else{
                    i++;
                }
        } 
          for(int k=0;k<nums.length;k++){
            if(nums[k]!=k+1){
               return k+1;
            }
        }
        return n+1;   
        
    }
}
class Solution {
    public int[] applyOperations(int[] nums) {
       int i=0;
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]==nums[j+1]){
                nums[j]*=2;
            
                nums[j+1]=0;
            }
              i++;
        }

         int j=0;
        for(i=0;i<nums.length;i++){
          if(nums[i]!=0){
            nums[j]=nums[i];
            j++;
          }
       }
       while(j<nums.length){
                    nums[j]=0;
                    j++;
                }
        
        return nums;
        
    }
}
class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        
         int i=0;
        while(i<nums.length){
            if(nums[i]==i+1){
                
                i++;
            }else{

             
                int j=nums[i]-1;
                if(nums[i]==nums[j]){
                    return nums[i];
                }else{
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                }
            }
        }

      
      
    
        return -1;

    }

}
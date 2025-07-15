class Solution {
    public void moveZeroes(int[] nums) {

       
        int j=0;
        int k=0;
        int l=nums.length-1;
        for(int i=0;i<nums.length;i++){
          if(nums[i]!=0){
            nums[j]=nums[i];
            j++;
          }else{
          k++;
          }
        
              }

                for(int i=0;i<k;i++){
                    nums[l]=0;
                    l--;
                }



        
    }
}
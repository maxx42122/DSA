class Solution {
    public int dominantIndex(int[] nums) {
        int maxindex=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max){
                max=nums[i];
                maxindex=i;

            }
        }
           for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(x*2>max && x!=max){
                return -1;

            }

           }
           return maxindex;

        

        
    }
}
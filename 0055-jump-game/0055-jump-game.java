class Solution {
    public boolean canJump(int[] nums) {
        int f=nums.length-1;

        for(int i=nums.length-2;i>=0;i--){

            if(i+nums[i]>=f){
                f=i;
            }


        }
        return f==0;
    }
}
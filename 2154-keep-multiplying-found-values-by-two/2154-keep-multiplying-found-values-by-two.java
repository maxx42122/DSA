class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                r++;

            }

        }
        if(r==0)return original;
    int x=original;
          for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                x*=2;
            }
          }
          return x;


        
    }
}
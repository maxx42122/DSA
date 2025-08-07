class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        for(int i=n;i>2;i--){

        if(nums[i-3]+nums[i-2]>nums[i-1] ){
            return nums[i-3]+nums[i-2]+ nums[i-1];

        }
        }
        return 0;


        
    }
}
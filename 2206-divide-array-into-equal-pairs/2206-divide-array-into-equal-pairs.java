class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int j=nums[0];
        int cnt=0;

        for(int i=0;i<nums.length;i++){

            if(j==nums[i]){
                cnt++;
            }else{
                j=nums[i];
                if(cnt%2!=0)return false;
                cnt=1;
            }


        }
        return true;
        
    }
}
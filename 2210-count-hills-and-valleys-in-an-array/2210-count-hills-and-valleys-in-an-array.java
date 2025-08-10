class Solution {
    public int countHillValley(int[] nums) {

        int cnt=0;

        int i=0;
        int j=1;
     while(j<nums.length-1){
            if((nums[i]>nums[j] && nums[j+1]>nums[j]) ||(nums[i]<nums[j] && nums[j+1]<nums[j])){
                cnt++;
                i=j;
                
            }
                j++;
            
            
            
        }
      
        return cnt;
        
    }
}
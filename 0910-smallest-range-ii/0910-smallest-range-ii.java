
class Solution {
    public int smallestRangeII(int[] nums, int k) {
   

    int maxx=Integer.MIN_VALUE;
        int minn=Integer.MAX_VALUE;
     Arrays.sort(nums);
        int r=nums[nums.length-1]-nums[0];

        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            maxx=Math.max(nums[nums.length-1]-k,nums[i]+k);
           minn=Math.min(nums[0]+k,nums[j]-k);
             r=Math.min(r,(maxx-minn));
        }
      
          
      
        return r; 
    
    }
}

class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                cnt++;
            }
        }
        int pro1=0;
        if(cnt>=2){
             pro1=nums[0]*nums[1]*nums[n-1];
            
        }
       int pro=nums[n-1]*nums[n-2]*nums[n-3];
       return Math.max(pro,pro1);
        
    }
}
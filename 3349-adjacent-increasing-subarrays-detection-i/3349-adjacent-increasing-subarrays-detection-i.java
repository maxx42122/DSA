class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if(nums.size()<2*k)return false;
        if(k==1)return true;
        

        for(int i=0;i<=nums.size()-2*k;i++){
            boolean a=check(nums,i,i+k);
            boolean b=check(nums,k+i,2*k+i);
            if(a&&b)return true;

        }
        return false;

        
    }
    private boolean check(List<Integer> nums,int st,int end){
        for(int i=st+1;i<end;i++){
               if (nums.get(i) <= nums.get(i - 1)) return false;
        }
        return true;     
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]={-1,-1};
        int st=binary(nums,target,true);
        int ed=binary(nums,target,false);
        res[0]=st;
        res[1]=ed;
     
        return res;
    }

    private int binary(int []nums,int target,boolean isstart){
          int start=0;
        int end=nums.length-1;
        int ans=-1;
    
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                ans=mid;
                if(isstart){
                    end=mid-1;
                }else{
                   start= mid+1;
                }

            }
        }
        return ans;
    }
}
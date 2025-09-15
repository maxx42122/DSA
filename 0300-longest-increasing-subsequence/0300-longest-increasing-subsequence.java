class Solution {
    public int lengthOfLIS(int[] nums) {

      
        int m=0;
        int arr[]=new int[nums.length];
        for(int i=1;i<nums.length;i++){
              int x=1;

            for(int j=0;j<i;j++){

            if(nums[j]<nums[i]){
                if(arr[j]+1>arr[i]){
                    arr[i]=arr[j]+1;
                }
            }
            }
        }

        for(int k:arr){
            if(m<k){
                m=k;
            }
        }
        return m+1;
        
    }
}
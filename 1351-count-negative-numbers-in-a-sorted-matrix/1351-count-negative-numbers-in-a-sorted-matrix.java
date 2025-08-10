class Solution {
    public int countNegatives(int[][] grid) {
   int cnt=0;
        for(int []i:grid){
            cnt+=count(i);

        }
        return cnt;
        
        
    }

      public int count(int[] nums) {


        int n=nums.length;
        int end=n-1;
        int neg=search(nums,0,end,-1);
       
       
        return n-neg;
        
        
    }
    private  int search(int[] nums,int start,int end, int target) {

       
    
        while(start<=end){
           int  mid=start+(end-start)/2;


            if(target>=nums[mid]){
                   end=mid-1;
              
            }else {
             
                  start=mid+1;
            }
           

        }
        return start;
        
}
}
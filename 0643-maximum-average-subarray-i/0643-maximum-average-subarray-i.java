class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];

        }

        int i=0;
        int end=k;

        double max=sum;
        while(end<nums.length){
          

            sum=sum+nums[end];
            sum=sum-nums[i];
            end++;
            i++;

              if(max<sum){
                max=sum;
            }

        }

        return (double)max/k;
        
    }
}
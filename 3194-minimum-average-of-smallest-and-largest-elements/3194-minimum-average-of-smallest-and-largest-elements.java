class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
    int i=0;
    
    Double avg=0.0;
    Double sum=0.0;
    int n=nums.length;
       Double min=Double.MAX_VALUE;
    int j=n-1;
        while(i<j){
 avg=(nums[i]+nums[j])/2.0;
            min=Math.min(min,avg);

          
        
           i++;
           j--;

        }
        return min;
        
    }
}
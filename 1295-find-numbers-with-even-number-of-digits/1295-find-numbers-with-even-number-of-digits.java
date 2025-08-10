class Solution {
    public int findNumbers(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length;i++){

            boolean res=count(nums[i]);
            if(res)count++;


        }
        return count;
        
    }
    private boolean count(int num){
        
      
            int cnt=0;
            while(num>0){
                int dig=num%10;
                cnt++;
                num/=10;

            }
            if(cnt%2==0)return true;
            return false;


        }
    
}
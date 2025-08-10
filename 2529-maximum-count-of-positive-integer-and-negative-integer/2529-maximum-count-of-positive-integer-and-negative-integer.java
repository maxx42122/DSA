class Solution {
    public int maximumCount(int[] nums) {
        int cnt=0;
        int cnt2=0;

        for(int i:nums){
            if(i>0){
                cnt++;
            }else if(i<0){
                cnt2++;
            }
        }

        return Math.max(cnt,cnt2);
        
        
    }
}
class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt=0;
        HashMap <Integer,Integer>map = new HashMap();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int j=0;j<nums.length;j++){
          int re=k+nums[j];

        if(map.containsKey(re)){
            cnt+=map.get(re);
                }
        }
        return cnt;
    }
}
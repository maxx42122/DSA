class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List <Integer>list=new ArrayList();

        Arrays.sort(nums);
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[j]>=nums[i]){
                list.add(nums[i]);
            }
            j++;



        }
        return list;
    }
}
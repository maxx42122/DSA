class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List <Integer> list=new ArrayList();

        Set <Integer> s=new HashSet();
        Arrays.sort(nums);

          

  
        for(int i=1;i<=nums.length;i++){
            s.add(i);
        }

        for(int j:nums){
            if(s.contains(j)){
                s.remove(j);
            }
        }

        for(int k:s){
            list.add(k);
        }
        return list;
    }
}
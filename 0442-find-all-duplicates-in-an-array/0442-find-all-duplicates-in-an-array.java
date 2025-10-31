class Solution {
    public List<Integer> findDuplicates(int[] nums) {
           Map <Integer,Integer>map=new HashMap<>();
        for(  int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer>list=new ArrayList<>();
        for(int k:map.keySet()){
            if(map.get(k)>=2){
                list.add(k);
            }
        }
        return list;
    }
}
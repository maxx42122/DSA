class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        Map <Integer,Integer>map=new HashMap<>();
        for(  int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int z=0;
        int[]arr=new int[2];;
        for(int k:map.keySet()){
            if(map.get(k)==2){
                arr[z++]=k;
            }
        }
        return arr;
    }
}
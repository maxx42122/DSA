class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        Map <Integer,Integer>map=new HashMap<>();
        for(  int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int z=0;
        for(int k:map.keySet()){
        System.out.print( k+" : "+ map.get(k)+"\t");
            if(map.get(k)>=2){
                int n=map.get(k);
                z+=n*(n-1)/2;
             
            }
        }
        return z;
    }
}
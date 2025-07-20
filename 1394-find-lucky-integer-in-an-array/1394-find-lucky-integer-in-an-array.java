import java.util.Arrays;

class Solution {
     int findLucky(int[] arr) {
        int max=-1;
    HashMap<Integer,Integer> hp=new HashMap();
    for(int i=0;i<arr.length;i++){
        hp.put(arr[i], hp.getOrDefault(arr[i],0)+1);
    }

 
      for(Map.Entry<Integer, Integer> entry : hp.entrySet()) {
            //System.out.println(entry.getKey() + " " + entry.getValue() + " " + (entry.getKey() == entry.getValue()));
            if(entry.getKey().equals(entry.getValue())) {
                max = Math.max(max, entry.getKey());
            }
        }
   return max;
      
    //   int freq[]=new int[501];



    //     for(int i=0;i<arr.length;i++){
          
    //         freq[arr[i]]++;
    //     }

    //    for(int i=freq.length-1;i>0;i--){
    //     if(freq[i]==i){
    //         return i;
    //     }
    //    }
    //    return -1;
      
        
    }
}

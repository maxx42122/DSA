class Solution {
    public int heightChecker(int[] heights) {
        int cnt=0;
         int []arr1=new int[heights.length];
          for(int i=0;i<heights.length;i++){
            arr1[i]=heights[i];

          }        
    Arrays.sort(heights);
       
        for(int i=0;i<heights.length;i++){
            if(arr1[i]!=heights[i]){
                cnt++;   
            }  
        }
        return cnt;
        
    }
}
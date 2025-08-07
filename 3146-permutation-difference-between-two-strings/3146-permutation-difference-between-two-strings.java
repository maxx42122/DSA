class Solution {
    public int findPermutationDifference(String s, String t) {

        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
       
       
    
       int sum=0;
  for(int j=0;j<arr1.length;j++){
       for(int i=0;i<arr2.length;i++){
        if(arr1[j]==arr2[i]){
            sum+=Math.abs(i-j);

        }}
       }
       return sum;
        
    }
}
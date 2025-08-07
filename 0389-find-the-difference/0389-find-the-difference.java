class Solution {
    public char findTheDifference(String s, String t) {

        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        int sum1=0;
        int sum2=0;

       int i=0;
       int j=0;

       while(i<arr1.length ){
        sum1+=(int)arr1[i];

        i++;
        
       }

         while( j<arr2.length){
        sum2+=(int)arr2[j];
        j++;
       }
       return (char)Math.abs(sum2-sum1);
        
    }
}
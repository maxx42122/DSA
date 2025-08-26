class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {

        int l1=0;
        int max=0;
        int max1=0;

        for(int i=0;i<dimensions.length;i++){

            int s1=dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1];
           if(max<s1){
            max=s1;
            max1=dimensions[i][0]*dimensions[i][1];
          
           }else if(max==s1){
            max=s1;
             l1=dimensions[i][0]*dimensions[i][1];
            max1=Math.max(max1,l1);
           }


        }

    

        return max1;

        
    }
}
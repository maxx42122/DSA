class Solution {
    int sum=0;
    public int hammingWeight(int n) {
     int nx=0;
      

        if(n==0)return 0;
     
           nx=n%2;

             System.out.println(sum);
        hammingWeight(n/2);
        sum+=nx;
       
      
        return sum;


        
    }


}
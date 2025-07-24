class Solution {
    public int climbStairs(int n) {

        int i=1;
        int j=2;
        int sum=0;

        if(n==1)return 1;
        if(n==2)return 2;
        for(int k=2;k<n;k++)
        {   
            int r=j;
           
            sum=i+j;
           i=j;
           j=sum;
            
            
               

        }
        return sum;
        
    }
}
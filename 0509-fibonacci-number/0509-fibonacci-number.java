class Solution {
 public int fib(int n) {
        int i=0;
        int j=1;
        int sum=0;
        if(n==1)return 1;
        if(n==0)return 0;

       for(int k=2;k<=n;k++){
        sum=i+j;
      
        i=j;
          j=sum;

       }
             return sum;
    }
    
}
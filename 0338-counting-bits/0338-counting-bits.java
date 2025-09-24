class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
     for(int i=0;i<=n;i++){
       arr[i]=  hammingWeight(i);
     }
     return arr;

        
    }

    int hammingWeight(int n) {

        if(n==0)return 0;
       return n%2 + hammingWeight(n/2);
        
        
    }
}
class Solution {
    public int maximumWealth(int[][] accounts) {
 int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=sum(accounts[i]);
             max=Math.max(sum,max);
        }
        return max;


        
    }

    private int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
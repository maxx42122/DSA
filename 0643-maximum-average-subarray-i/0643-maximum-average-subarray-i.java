class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max=sum;
        int x=0;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[x++];
            if(sum>max)max=sum;

        }
        return (double)max/k;
    }
}
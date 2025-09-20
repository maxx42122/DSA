class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max=sum;
          System.out.print(sum+" ");
        int x=0;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[x++];
            if(sum>max)max=sum;
              System.out.print(sum+" ");

        }

        // int nums[]=new int[arr.length];

        // int st=0;
        // nums[0]=arr[0];
     
        // for(int i=1;i<arr.length;i++){
        //     nums[i]=arr[i-1]+arr[i];
        //      System.out.print(nums[i]+" ");
        //        System.out.println();
        
        // }
        // int sum=nums[0];
        // int max=nums[0];

        // for(int i=k;i<arr.length;i++){
        //     sum=nums[k]-nums[st++];
        //     if(sum>max){
        //         max=sum;
        //     }
        //      System.out.print(sum+" ");
        // }

        
        return (double)max/k;
    }
}
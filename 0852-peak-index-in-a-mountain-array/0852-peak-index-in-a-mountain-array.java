class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        // int end=arr.length-1;;
        // int start=0;
        // int max=0;
        // int res=0;
        //   while(start<=end){
        //    int  mid=start+(end-start)/2;

        //    if(max<arr[mid]){
        //     max=Math.max(arr[mid],max);
        //          res=mid;
        //    }
        
        //     if(arr[mid]<=arr[mid+1]){
        //              start=mid+1;  
             
        //     }else {
        //           end=mid-1;     
               
        //     }

        // }
int max=0;
int j=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                j=i;
            }
        }
        return j;
        
    }
}
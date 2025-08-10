class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int n=arr.length-1;
        int end=n;
        int start=0;
        int max=0;
        int res=0;
          while(start<=end){
           int  mid=start+(end-start)/2;
      

           if(max<arr[mid]){
            max=Math.max(arr[mid],max);
                 res=mid;


           }
        
            if(arr[mid]<=arr[mid+1]){
                     start=mid+1;
               
             
            }else {
                  end=mid-1;
              
               
            }
           

        }
        return res;
        
    }
}
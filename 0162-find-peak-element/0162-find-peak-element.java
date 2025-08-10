class Solution {
    public int findPeakElement(int[] arr) {

        int end=arr.length-1;;
        int start=0;
    
          while(start<end){
           int  mid=start+(end-start)/2;
        
            if(arr[mid]<arr[mid+1]){
                     start=mid+1;  
             
            }else {
                  end=mid;     
               
               }
          }
        return end;
        
        
    }
}
class Solution {
    public void duplicateZeros(int[] arr) {
        int arr1[]=new int[arr.length];
        int j=0;
        for(int ele:arr){
            arr1[j]=ele;
            j++;

        }
        int k=0;
        for(int i=0;i<arr1.length;i++){
         
            if( arr1[k]==0 && arr1[i+1]!=0 ){

              arr[i]=0;
                arr[i+1]=0;
                
                i++;

            }
            else{
                arr[i]=arr1[k];
            }
            k++;
        }
        
    }
}
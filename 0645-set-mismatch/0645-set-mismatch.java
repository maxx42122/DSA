class Solution {
    public int[] findErrorNums(int[] nums) {
  int arr[]=new int[2];
          int n=nums.length;
        
         int i=0;
        while(i<nums.length){
            if(nums[i]==i+1){
                
                i++;
            }else{

             
                int j=nums[i]-1;
                if(nums[i]==nums[j]){
                    arr[0]=nums[i];
                    i++;
                }else{
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                }
            }
        }    
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k+1){
                arr[1]=k+1;
                break;
            }
        }
        return arr;

        
    }
}
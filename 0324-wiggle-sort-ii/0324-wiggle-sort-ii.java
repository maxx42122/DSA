class Solution {
    public void wiggleSort(int[] nums) {


        Arrays.sort(nums);
        int res[]=new int[nums.length] ;
int i = (nums.length + 1) / 2 - 1;
        int k=nums.length-1;

        for(int j=0;j<nums.length;j++){
            if(j%2==0){
                res[j]=nums[i];
                i--;
            }else{
                res[j]=nums[k];
                k--;
            }
        }
         for(int j=0;j<nums.length;j++){
            nums[j]=res[j];
         }

    }
}
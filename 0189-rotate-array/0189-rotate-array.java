// class Solution {
//     public void rotate(int[] nums, int k) {
//       int n=nums.length;
//       k=k%n;
//         int start=n-k;
//         ArrayList<Integer>arr=new ArrayList<>();
//         for(int i=start;i<n;i++){
//             arr.add(nums[i]);
//         }
//         for(int i=0;i<start;i++){
//             arr.add(nums[i]);
//         }
//     for (int i = 0; i < arr.size(); i++) {
//     nums[i] = arr.get(i);
// }
//     }
// }
















class Solution {
    public void rotate(int[] nums, int k) {
      int n=nums.length;
     k=k%n;
        int start=k;

        rev(nums,0,n-1);
        rev(nums,0,start-1);
        rev(nums,start,n-1);
    }

       private void rev(int nums[],int start,int end){
            while(start<end){
             int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start ++;
        end --;
            }
       
    }
}
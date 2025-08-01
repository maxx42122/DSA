class Solution {
    public void rotate(int[] nums, int k) {
      int n=nums.length;
      k=k%n;
        int start=n-k;
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=start;i<n;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<start;i++){
            arr.add(nums[i]);
        }
    for (int i = 0; i < arr.size(); i++) {
    nums[i] = arr.get(i);
}
    }
}
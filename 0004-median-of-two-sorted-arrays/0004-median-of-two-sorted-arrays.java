class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


           List<Integer> mergedList = new ArrayList<>();
        for (int num : nums1) {
            mergedList.add(num);
        }
        for (int num : nums2) {
            mergedList.add(num);
        }
          Collections.sort(mergedList);

       int n = mergedList.size() / 2;
double median;

if (mergedList.size() % 2 == 1) {
   
    median = mergedList.get(n); 
} else {
  
    median = (mergedList.get(n - 1) + mergedList.get(n)) / 2.0;
}
          
        return median;
        
    }
}
class Solution {
    public int possibleStringCount(String word) {
        int cnt=1;
      char[] arr = word.toCharArray();
      if (arr.length==1)return 1;

      for(int i=1;i<arr.length;i++){

        if(arr[i-1]==arr[i]){
            cnt++;
        }
      }
      return cnt;
    }
}
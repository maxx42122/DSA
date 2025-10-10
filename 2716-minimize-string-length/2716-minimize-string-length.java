class Solution {
    public int minimizedStringLength(String s) {

        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        int cnt=1;
        char t=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=t){
                cnt++;
                t=arr[i];
            }
        }
        return cnt;
        
    }
}
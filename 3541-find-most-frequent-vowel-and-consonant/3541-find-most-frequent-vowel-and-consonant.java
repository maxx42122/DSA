class Solution {
    public int maxFreqSum(String s) {
        int arr[]=new int[26];
        char h[]=s.toCharArray();

        for(char ch:h){
           arr[ch-'a']++;  
        }
        int m1=0;
        int m2=0;
        for(int i=0;i<arr.length;i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20){
                m1=Math.max(arr[i],m1);
            }else{
                m2=Math.max(arr[i],m2);

            }
        }
        return m1+m2;        
        
    }
}
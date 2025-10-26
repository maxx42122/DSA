class Solution {
    public int countSubstrings(String s) {
            int cnt=0;

        for(int i=0;i<s.length();i++){
            cnt+=isvalid(s,i,i);
            cnt+=isvalid(s,i,i+1);
        }

        return cnt;

        
    }
    private int isvalid(String s,int left,int right){
        int count =0;
        while(left>=0 && right<s.length()&& s.charAt(left)==s.charAt(right)){
            count ++;
            right++;
            left--;
        }
        return count;
    }
}
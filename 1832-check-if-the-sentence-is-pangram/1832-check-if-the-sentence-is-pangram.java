class Solution {
    public boolean checkIfPangram(String sentence) {

        int arr[]=new int[26];
        char ch[]=sentence.toCharArray();

        for(char c:ch){
            arr[c-'a']++;
        }

        for(int i:arr){
            if(i==0)return false;
        }
        return true;
    }
}
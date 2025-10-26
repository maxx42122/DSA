class Solution {
    public boolean isPalindrome(String s) {


        char arr[]=s.toLowerCase().replaceAll("[^a-z0-9]","").trim().toCharArray();
        int st=0;
        int end=arr.length-1;
        while(st<end){
            if(arr[st]!=arr[end])return false;
            st++;
            end--;

        }
        return true;


        
    }
}
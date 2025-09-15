class Solution {
    public boolean isPalindrome(String s) {
        // String p= s.toLowerCase().replaceAll("[^a-z0-9]", "").trim();
       // char arr[]=a.tiLoweCase().replaceAll("^a-z0-9","").trim().toCharArray();












         char arr[]=s.toLowerCase().replaceAll("[^a-z0-9]", "").trim().toCharArray();
        int start=0;
        int end=arr.length-1;
         while(start<end){
             if(arr[start]!=arr[end]){
                return false;
             }
             start++;
             end--;
         }
         return true;
         
    }
}
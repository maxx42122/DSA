class Solution {
    public boolean isPalindrome(String s) {

        char []arr=s.toLowerCase().replaceAll("[^a-z0-9]","").trim().toCharArray();
        int start=0;
        int end=arr.length-1;
        for(char c:arr){
            System.out.print(c);
        }

        while(start<end){
            if(arr[start]!=arr[end])return false;

            start++;
            end--;
        }
        return true;
        
    }
}
class Solution {
    public int longestValidParentheses(String s) {
         int left=0;
        int right=0;
        int max=0;
       


        char []arr=s.toCharArray();
        if(arr.length==1)return 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('  ){
                left++;

            }else   if(arr[i]==')'  ){
                right++;

            }

            if(left==right ){
                max=Math.max(max,right*2);
            }else if(left<right){
                right=0;
                left=0;
            }
   
        }

           left=0;
         right=0;
        
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]=='('  ){
                left++;

            }else   if(arr[i]==')'  ){
                right++;

            }

            if(left==right ){
                max=Math.max(max,right*2);
            }else if(left>right){
                right=0;
                left=0;
            }
   
        }
     
        return max;


        
    }
}
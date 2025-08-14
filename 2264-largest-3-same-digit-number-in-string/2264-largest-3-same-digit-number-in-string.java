class Solution {
 public String largestGoodInteger(String num) {

    
       char arr[] =num.toCharArray();
      
int max=0;
       for(int i=arr.length-1;i>1;i--){
        if(arr[i]==arr[i-1]&& arr[i]==arr[i-2]){
            max=Math.max(max, arr[i]);
        }

       }
       if(max>0){
        char []data={(char)max,(char)max,(char)max};

            return new String(data);
    }
       return new String("");

        
    }
}
class Solution {
    public boolean isSubsequence(String s, String t) {

        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        int k=-1;
        for(int i=0;i<arr1.length;i++){
            char c=arr1[i];
            boolean flag=false;
        for(int j=k+1;j<arr2.length;j++){
            if(c==arr2[j]){
                flag=true;
                if(k<j ){
                k=j;
                break;
                }else{
                    return false;
                }
             
            }  
        }
        if(flag==false)return false;
        }
        return true;
        
    }
}
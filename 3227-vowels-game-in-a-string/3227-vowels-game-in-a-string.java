class Solution {
    public boolean doesAliceWin(String s) {
        char arr[]=s.toCharArray();
        int count=0;
        for(char t:arr){
            if(t=='a' || t=='e' || t=='i' || t=='o' || t=='u'){
                count++;
            }
        }
        if(count>0){
          return   true;
        }
        return false;
        
    }
}
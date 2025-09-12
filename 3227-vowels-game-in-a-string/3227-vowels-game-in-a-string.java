class Solution {
    public boolean doesAliceWin(String s) {
        char arr[]=s.toCharArray();
        //int count=0;
        for(char t:arr){

              switch (t) {
                case 'a','e','i','o','u':
                    return true;
            }
        }

        //     if(t=='a' || t=='e' || t=='i' || t=='o' || t=='u'){
        //         count++;
        //     }
        // }
        // if(count>0){
        //   return   true;
        // }
        return false;
        
    }
}
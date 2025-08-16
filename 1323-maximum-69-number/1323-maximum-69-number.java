class Solution {
    public int maximum69Number (int num) {
        int []arr=new int[4];
        int i=3;
        while(num>0){
                int dig=num%10;
                arr[i]=dig;
                num/=10;
                i--;

        }

        for(int j=0;j<arr.length;j++){
            if(arr[j]==6){
                arr[j]=9;
                break;
            }


        }
        int num1=0;
 for(int k=0;k<arr.length;k++){
          num1  =(num1*10)+arr[k];
        
        
        }
return num1;
        
    }
}
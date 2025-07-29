class Solution {
    public int countPrimeSetBits(int left, int right) {
        int result=0;

      

        for(int i=left;i<=right;i++){
             String binary = "";

        int num = i;
        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }


        char[]ch=binary.toCharArray();
        int cnt=0;
        for(int j=0;j<ch.length;j++){
            if(ch[j]=='1'){
                cnt++;
            }
        }
      boolean ans= isprime(cnt);

      if(ans==true){
        result++;
      }




        }
        
        return result;
    }


      boolean isprime(int num){
            int x=num;

            int count =0;
            while(x>0){
                if(num%x==0){
                    count++;
                }
               
                x--;
            }
            if(count>2 || count ==1){
                return false;
            }
            return true;

        }
}
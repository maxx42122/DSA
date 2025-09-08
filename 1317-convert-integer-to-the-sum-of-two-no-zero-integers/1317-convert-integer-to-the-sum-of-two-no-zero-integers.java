class Solution {
    public int[] getNoZeroIntegers(int n) {

      int[]arr=new int[2];
      int a=1;
      int b=n-1;
      for(int i=1;i<=n/2;i++){
       // System.out.println(a +"===="+ b);
        if(a+b==n && check(a,b)==true){         

            arr[0]=a;
            arr[1]=b;
        }
        a++;
        b--;
   }
     System.out.println(arr[0] +"===="+ arr[1]);
      return arr; 
    }

    boolean check(int x,int y){
          while(x>0 || y>0 && x>=10 && y>=10){
      

              
               if(x%10==0)return false;
               if(y%10==0)return false;
               x/=10;
               y/=10;

            }
            return true;
    }

}
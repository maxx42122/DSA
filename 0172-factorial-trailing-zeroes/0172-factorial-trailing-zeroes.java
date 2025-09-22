class Solution {
    public int trailingZeroes(int n) {
      //  double x=fact(n);
      //  System.out.println(x);
        //return zero(x);        
        return n/3125+n/625+n/125+n/25+n/5;
    }

    double fact(int n){
        if(n==0)return 1;
        return n*fact(--n);
    }
  int cnt=0;
    int zero(double x){
      
        if(x==0)return 0;
        if(x%10==0){
            cnt++;

        }else {
            return 0;
        }
        zero(x/10);
              System.out.println(cnt);
        return cnt;
    }
}
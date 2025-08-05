class Solution {
    public boolean canMeasureWater(int x, int y, int target) {

          if((x+y)<target)return false;
            return target%gcd(x,y)==0;

        
    }
    private int gcd(int x,int y){
        return y ==0?x:gcd(y,x%y);
    }

}
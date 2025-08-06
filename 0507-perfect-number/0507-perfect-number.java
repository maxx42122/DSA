class Solution {
    public boolean checkPerfectNumber(int num) {
        int x=getfact(num);

        if(num==x)return true;
        return false;
        
    }
    private int getfact(int n){
        int sum=0;

        for(int i=1;i<n/2+1;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}
class Solution {
    public String convertToBase7(int num) {

    if(num==0)return "0";

    int sign=1;
    if(num<0){
    sign=-1;
    }


    Math.abs(num);
    StringBuilder s=new StringBuilder();
    while(num!=0){
int rem=num%7;
        s.insert(0,rem);
        num/=7;
    }
    return sign==-1 ?s.toString():s.toString();
        
    }
}
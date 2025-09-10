class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n=nums.length;
        int d=0;
        if(n%2==0){
            d=n/2;

        }else{
            d=n/2+1;
        }
            System.out.println(d);


        long c=0;
        for(int i=0;i<d;i++){
            int a=nums[i];
            int b=nums[n-i-1];
            long s=0;
            if(i==n-i-1){
                s=a;
            }
            else if(b<10){
                s=a*10+b;
            }else if(b<100){
                s=a*100+b;
            }else if(b<1000){
                s=a*1000+b;
            }else if(b<10000){
                     s=a*10000+b;

            }else if(b==10000){
                 s=a*100000+b;

            }
            System.out.println(s);

            c+=s;


            }
            return c;
        
    }
}
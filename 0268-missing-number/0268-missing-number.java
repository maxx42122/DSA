class Solution {
    public int missingNumber(int[] nums) {
    int sum=0;
    int max=0;
    for(int i:nums){
        sum+=i;
       

    }

    return fact(nums.length)-sum;


      

        
    }


    int fact(int x){
        int f=0;
        for(int i=x;i>0;i--){
            f+=i;
            
        }
        return f;
    }

}
class Solution {
    public int[] sumZero(int n) {

        int x=n/2;
        int z=0-x;
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){

            if(n%2==1){
            arr[i]=z;
           
            }else{
                if(z==0)z++;
                    
                 arr[i]=z;
                
            }
             z++;
        }
        return arr;

        
    }
}
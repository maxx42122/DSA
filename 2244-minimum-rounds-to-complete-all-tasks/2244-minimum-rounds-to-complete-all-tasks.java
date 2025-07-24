class Solution {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        int n=tasks.length;

        int arr[]=new int[n+1];
        int cnt=0;
        int cnt2=0;
        if(n==1)return -1;
    

        for(int i=1;i<n;i++){
            if(tasks[i]==tasks[i-1]){
                cnt++;
           }else{
                cnt=0;
            }
              arr[i]=cnt;
        }
            
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]==0 && arr[j+1]==0 )return -1;
            

            if(arr[j]==0){
                cnt2++;
            }else if(arr[j]%3==0){
                cnt2++;
            }
                   }
                    return cnt2;
           }
}

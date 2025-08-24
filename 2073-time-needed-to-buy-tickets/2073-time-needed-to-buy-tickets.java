class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int sum=0;
        int cnt=0;

        for(int i=k+1;i<tickets.length;i++){
            if(tickets[k]<=tickets[i]){
                cnt++;
            }
        }
        for(int i:tickets){

            if(i<tickets[k]){
                sum+=i;
             

            }else {
                sum+=tickets[k];
                  
            }

        }
        return sum-cnt;
    }
}
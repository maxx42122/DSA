class Solution {
    public int countPrimes(int n) {
          if (n < 2) return 0;

    boolean isprime[]=new boolean[n];
    Arrays.fill(isprime,true);
      isprime[0] = false;
        isprime[1] =false;

    for(int i=2;i*i<n;i++){
        if(isprime[i]){
            for(int j=i*i;j<n;j+=i){
                isprime[j]=false;
            }
        }
    }

    int cnt=0;
    for(boolean i:isprime){
        if(i)cnt++;
    }

    return cnt;

    }
    }

        //this is for smALL NUMBERS
    //     int count=0;
    //     if(n<2)return 0;
    //     for(int i=2;i<n;i++){
    //         if(isprime(i)==true)count++;
    //     }
    //     return count;
        
    // }

    // private boolean isprime(int num){
    //     int cnt=0;
    //   for(int i=num;i>0;i--){

    //         if(num%i==0){
    //             cnt++;
    //         }


    //     }
    //     if(cnt==2)return true;
    //     return false;
    
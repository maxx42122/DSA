class Solution {
    public int countPrimes(int n) {
          if (n < 2) return 0;

    int isprime[]=new int[n];
    Arrays.fill(isprime,1);
      isprime[0] = 0;
        isprime[1] =0;

    for(int i=2;i*i<n;i++){
        if(isprime[i]==1){
            for(int j=i*i;j<n;j+=i){
                isprime[j]=0;
            }
        }
    }

    int cnt=0;
    for(int i:isprime){
        if(i==1)cnt++;
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
    
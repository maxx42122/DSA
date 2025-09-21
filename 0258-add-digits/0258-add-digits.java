// class Solution {
//   int s=0;
//  public int addDigits(int num) {
//     if(num==0)return 0;
//     s+=num%10;
//     addDigits(num/10);
//      if(s>=10){
//         num=s;
//         s=0;
//         addDigits(num);
//     }
//     return s;
//  }
// }
class Solution {
    public int addDigits(int num) {
        if (num < 10) return num;

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return addDigits(sum);
    }
}




  


    //     while (num >= 10) {
    //         int sum = 0;
    //         while (num > 0) {
    //             sum += num % 10;  // Add last digit
    //             num /= 10;        // Remove last digit
    //         }
    //         num = sum;
    //     }
    //     return num;
    // }

   

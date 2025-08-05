class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j--) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }

        return sb.reverse().toString();
    }
}




// class Solution {
//     public String addStrings(String num1, String num2) {

//         int n1=intstr(num1);
//         int n2=intstr(num2);
//         int sum=n1+n2;

        
//         return Integer.toString(sum);        
//     }

//     private int intstr(String str){
//         char [] arr=str.toCharArray();
//         int n=arr.length;
//         int num=0;
//         for(int i=0;i<n;i++){
//             int dig=(int)arr[i]-48;
//             num=num*10+dig;
         

//         }
//         return num;
//     }
// }
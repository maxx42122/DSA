class Solution {
    public String removeDuplicates(String s) {


        StringBuilder sb=new StringBuilder();

        for(char c:s.toCharArray()){
            int len=sb.length();
            if(0<len && sb.charAt(len-1)==c){
                   sb.deleteCharAt(len - 1);
            }else{
                sb.append(c);
            }
        }

        return sb.toString();
        // for (int i = 1; i < s.length(); i++) {
        //     if (s.charAt(i) == s.charAt(i - 1)) {
        //         String rem = s.substring(0, i - 1) + s.substring(i + 1);
        //         return removeDuplicates(rem);
        //     }
        // }
        // return s;
    }
}

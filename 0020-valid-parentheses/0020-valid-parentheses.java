class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack();

        char []arr=s.toCharArray();
        if(arr.length==1)return false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('  ){
                st.push(')');

            }else   if(arr[i]=='{'  ){
                st.push('}');

            }
            else   if(arr[i]=='['  ){
                st.push(']');

            }else if(arr[i]==st.peek()){
                st.pop();
            }else{
                return false;
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;


        
        
    }
}
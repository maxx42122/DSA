class Solution {
    public boolean isValid(String s) {

        Stack st=new Stack();

        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(')');
            }else if(c=='{'){
                st.push('}');
            }else if(c=='['){
                st.push(']');
             } else if (!st.isEmpty() && c == st.peek()) {
                    st.pop();
            }else{
                return false;
            }
                         
            }
            return st.isEmpty();
        
        
    }
}
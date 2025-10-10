class Solution {
    public boolean backspaceCompare(String s, String t) {
                String s1=check(s);
                String s2=check(t);
                System.out.println(s1);
                System.out.println(s2);
            if(s1.compareTo(s2)==0){
                return true;
            }
        return false;
    }

    String check(String s){
         Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
        if (c == '#') {
            if (!stack.isEmpty()) {
                stack.pop(); 
            }
        } else {
            stack.push(c); 
        }

    }
    StringBuilder result = new StringBuilder();
    for (char c : stack) {
        result.append(c);
    }

    return result.toString();
    }
}
class Solution {
    public int minOperations(String[] logs) {
        int c = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                if (c > 0) c--; 
            } else if (!log.equals("./")) {
                c++; 
            }
        }
        return c;
    }
}

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuffer sb=new StringBuffer();

        while (columnNumber > 0) {
            columnNumber--;  // Adjust for 1-based indexing
            int remainder = columnNumber % 26;
            sb.append((char)(remainder + 'A'));
            columnNumber /= 26;
        }

        return sb.reverse().toString();  // Since we construct it backwards
    
    }
}
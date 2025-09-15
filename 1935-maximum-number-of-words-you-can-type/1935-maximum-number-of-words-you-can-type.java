class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
String[] words = text.split(" ");
        int count = 0;
        boolean[] broken = new boolean[26];

        // Mark broken letters
        for (char ch : brokenLetters.toCharArray()) {
            broken[ch - 'a'] = true;
        }

        // Check each word
        for (String word : words) {
            boolean canType = true;
            for (char ch : word.toCharArray()) {
                if (broken[ch - 'a']) {
                    canType = false;
                    break;
                }
            }
            if (canType) {
                count++;
            }
        }
        return count;
    }
}
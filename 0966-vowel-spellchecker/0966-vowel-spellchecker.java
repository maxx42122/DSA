class Solution {
   public String[] spellchecker(String[] wordlist, String[] queries) {
    Set<String> exact = new HashSet<>(Arrays.asList(wordlist));
    Map<String, String> caseInsensitive = new HashMap<>();
    Map<String, String> vowelMasked = new HashMap<>();
    Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));

    for (String w : wordlist) {
        String lower = w.toLowerCase();
        caseInsensitive.putIfAbsent(lower, w);

        String mask = lower.replaceAll("[aeiou]", "*");
        vowelMasked.putIfAbsent(mask, w);
    }

    String[] ans = new String[queries.length];
    for (int i = 0; i < queries.length; i++) {
        String q = queries[i];
        if (exact.contains(q)) {
            ans[i] = q;
        } else {
            String qLower = q.toLowerCase();
            if (caseInsensitive.containsKey(qLower)) {
                ans[i] = caseInsensitive.get(qLower);
            } else {
                String qMask = qLower.replaceAll("[aeiu]", "*");
                ans[i] = vowelMasked.getOrDefault(qMask, "");
            }
        }
    }
    return ans;
}
}

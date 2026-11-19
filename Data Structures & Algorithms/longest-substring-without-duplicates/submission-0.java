class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int l = 0;

        int maxLen = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            while(charSet.contains(ch)){
                charSet.remove(s.charAt(l));
                l++;
            }

            charSet.add(ch);

            maxLen = Math.max(maxLen, i - l + 1);
        }

        return maxLen;
    }
}

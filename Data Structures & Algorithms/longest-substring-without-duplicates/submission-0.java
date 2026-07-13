class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int result = 0;
        int start = 0;
        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < n; end++) {
            char ch = s.charAt(end);

            while (set.contains(ch)) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(ch);
            result = Math.max(result, end - start + 1);
        }

        return result;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxm = 0;
        int j = 0;
        Set<Character> mp = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            while (mp.contains(s.charAt(i))) {
                mp.remove(s.charAt(j));
                j++;
            }
            mp.add(s.charAt(i));
            maxm = Math.max(maxm, i - j + 1);
        }
        
        return maxm;
    }
}

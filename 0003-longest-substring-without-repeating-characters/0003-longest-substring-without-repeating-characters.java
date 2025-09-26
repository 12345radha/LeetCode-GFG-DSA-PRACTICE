class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length(),mx=0,j=0;
        int len=0;
        char[] a=s.toCharArray();
        Map<Character,Integer> mp=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            mp.put(a[i],mp.getOrDefault(a[i],0)+1);
            len++;
            while(mp.get(a[i])>1)
            {
                char startChar = a[j];
                mp.put(startChar, mp.get(startChar) - 1);
                j++;
                len--;
            }
             mx = Math.max(mx, len);
        }
        return mx;
      
    }
}
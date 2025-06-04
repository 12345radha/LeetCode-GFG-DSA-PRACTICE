class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res=new ArrayList<>();

        int[] mfreq=new int[26];
        Arrays.fill(mfreq,Integer.MAX_VALUE);

        for(String word:words)
        {
            int[] freq=new int[26];
            for(char c:word.toCharArray())
            {
                freq[c-'a']++;
            }
            for(int i=0;i<26;i++)
        {
            mfreq[i]=Math.min(mfreq[i],freq[i]);
        }
        }

       for (int i = 0; i < 26; i++) {
            for (int j = 0; j < mfreq[i]; j++) {
                res.add(String.valueOf((char) (i + 'a')));
            }
        }
        return res;
        
    }
}
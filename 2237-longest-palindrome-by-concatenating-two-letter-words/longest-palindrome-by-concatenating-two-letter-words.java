class Solution {
    public int longestPalindrome(String[] words) {
      Map<String,Integer> mp=new HashMap<>();
      int count=0;
      boolean hasMiddle = false;
     
     for(String word:words)
     {
        String rev=""+word.charAt(1)+word.charAt(0);
        if(mp.getOrDefault(rev,0)>0)
        {
            count+=4;
            mp.put(rev,mp.get(rev)-1);
        }
        else
        {
             mp.put(word, mp.getOrDefault(word, 0) + 1);
        }
     }
     int k=-1;
     int maxm=-1;
     for (String key : mp.keySet()) {
            if (key.charAt(0) == key.charAt(1) && mp.get(key) > 0) {
                hasMiddle = true;
                    k=mp.get(key);
                if(maxm<k)maxm=k;
            }
        }

        if (hasMiddle) count += maxm*2;

    return count;
          
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String s=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            if(s.length()>strs[i].length())
            s=strs[i];
        }

        String res="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int cnt=0;
            for(String tmp:strs)
            {
                if(tmp.charAt(i)==ch)
                cnt++;
                else
                return res;
            }
            if(cnt==strs.length)
            {
                res+=ch;
            }
           
        }
        return res;
    }
}
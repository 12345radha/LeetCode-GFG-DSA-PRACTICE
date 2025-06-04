class Solution {
    public boolean checkRecord(String s) {
        int cnt=0;
        char[] a=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(a[i]=='A')cnt++;
            if(cnt>1)return false;

            if(a[i]=='L')
            {
              if (i + 2 < s.length() && s.substring(i, i + 3).equals("LLL")) return false;
            }
        }
        return true;

    }
}
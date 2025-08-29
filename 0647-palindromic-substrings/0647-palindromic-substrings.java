class Solution {
    private boolean ispallin(String s)
    {
        char[] a=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<=j)
        {
            if(a[i]!=a[j])return false;
            i++;
            j--;
        }
        return true;
    }
    public int countSubstrings(String s) {
      int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(ispallin(s.substring(i,j+1)))cnt++;

            }
            
        }
        return cnt;

    }
}
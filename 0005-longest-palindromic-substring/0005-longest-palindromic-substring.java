class Solution {
    public boolean isPalindrome(String s)
    {
        char[] a=s.toCharArray();
        int l=0,r=s.length()-1;
        while(l<=r)
        {
            if(a[l]!=a[r])
            return false;
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String res="";
        int n=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j) && isPalindrome(s.substring(i,j+1)))
                {
                    if(res.length()<s.substring(i,j+1).length())
                    res=s.substring(i,j+1);
                }
            }
        }
        return res;
    }
}
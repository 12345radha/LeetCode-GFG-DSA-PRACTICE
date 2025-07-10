class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        Arrays.sort(g);
         Arrays.sort(s);
        int l=0,r=0,ans=0;

        while(l<n && r<m)
        {
             if(s[r]>=g[l]){ans++; l+=1; }
             r+=1;
        }
        return ans;
    }
}
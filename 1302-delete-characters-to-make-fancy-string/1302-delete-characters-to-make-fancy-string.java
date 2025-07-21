class Solution {
    public String makeFancyString(String s) {
        int i=0;
        int n=s.length();
        StringBuilder res=new StringBuilder();
        while(i<n)
        {
            int j=i;
            char ch=s.charAt(i);
            int cnt=0;
            while(j<n && ch==s.charAt(j))
            {
                cnt++;
                if(cnt>2){
                    j++;
                    continue;
                }
                else {res.append(ch);}
                j++;
            }
            i=j;

        }
        return res.toString();
        
    }
}
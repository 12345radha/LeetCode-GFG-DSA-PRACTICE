class Solution {
    public String[] divideString(String s, int k, char fill) {
        
        int n=s.length();
        int d=0,i=0,j=0;
        String temp="";
        if(n%k!=0)
        { d=k-(d%k);
        for(i=0;i<d;i++)
            temp+=fill;
        }
        s=s+temp;
        String[] res=new String[s.length()/k];
        i=0;
        while(i<s.length())
        {
            if(i+k-1<s.length())
            res[j]=s.substring(i,i+k);
            i=i+k;
            j++;
        }
        return res;
        

    }
}
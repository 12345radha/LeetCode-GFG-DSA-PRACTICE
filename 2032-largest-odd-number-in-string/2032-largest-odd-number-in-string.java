class Solution {
    public String largestOddNumber(String num) {
        String res="";
        int n=num.length();
        int index=-1;
        for(int i=n-1;i>=0;i--)
        {
            char ch=num.charAt(i);
            if((ch-'0')%2==1)
            {
                index=i;
                break;
            }
        }
        if(index>-1)
        res=num.substring(0,index+1);

        return res;
    }
}
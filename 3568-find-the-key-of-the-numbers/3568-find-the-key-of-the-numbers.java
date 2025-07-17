class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int ans=0;
        int place=1;
        while(num1>0 || num2>0 || num3>0)
        {
             int q=num1%10;
             int r=num2%10;
             int s=num3%10;
             num1/=10; num2/=10; num3/=10;
             int minm=Math.min(s,Math.min(q,r));
             ans+=minm*place;
             place*=10;
        }
        return ans;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] pre=new int[n];
        int maxm=0;
        pre[0]=prices[0];
        for(int i=1;i<n;i++)
        {
           if(prices[i]<pre[i-1])pre[i]=prices[i];
           else  pre[i]=pre[i-1];
           int d=prices[i]-pre[i];
           if(maxm<d)maxm=d;
        }
        return maxm;
    }
}
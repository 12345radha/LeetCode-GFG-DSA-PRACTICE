class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] profit=new int[n];
        profit[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--)
        {
            profit[i]=Math.max(prices[i],profit[i+1]);
        }

        int maxm=0;
        for(int i=0;i<n;i++)
        {
             int d=profit[i]-prices[i];
             maxm=Math.max(d,maxm);
        }
        return maxm;
    }
}
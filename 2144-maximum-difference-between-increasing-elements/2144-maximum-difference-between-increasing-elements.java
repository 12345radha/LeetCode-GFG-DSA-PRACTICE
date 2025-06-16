class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int maxm=nums[n-1];
        int ans=-1;
        for(int i=n-2;i>=0;i--)
        {
            maxm=Math.max(maxm,nums[i]);
            ans=Math.max(ans,maxm-nums[i]);
        }
       
        return (ans==0)?-1:ans;

    }
}
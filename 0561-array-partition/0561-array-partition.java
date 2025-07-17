class Solution {
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int i=0;
        int ans=0;
        while(i<nums.length)
        {
            ans+=Math.min(nums[i],nums[i+1]);
            i+=2;
        }
        return ans;
    }
}
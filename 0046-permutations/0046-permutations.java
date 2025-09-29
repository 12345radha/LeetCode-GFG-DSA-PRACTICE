class Solution {
    public void swap(int[]nums, int i,int j)
    {
        int x=nums[i];
        nums[i]=nums[j];
        nums[j]=x;
    }
    public void solve(int[] nums,int start,int end,List<List<Integer>> res)
    {
        if(start==end){
            List<Integer> temp=new ArrayList<>();
            for(int x:nums)temp.add(x);
            res.add(temp);
            return;
        }

        for(int i=start;i<=end;i++)
        {
            swap(nums,start,i);
            solve(nums,start+1,end,res);
            swap(nums,i,start);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();

        solve(nums,0,nums.length-1,res);
        return res;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int key=target-nums[i];
           if(mp.containsKey(key))
           return new int[] {mp.get(key), i};
           else mp.put(nums[i],i);
        }
        return new int[] {};
        
    }
}
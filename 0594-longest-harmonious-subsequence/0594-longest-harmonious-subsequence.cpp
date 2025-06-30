class Solution {
public:
    int findLHS(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        unordered_map<int,int> m;
        for(int i=0;i<nums.size();i++)
        {
            m[nums[i]]++;
        }
        int max=0;
        for(auto it:m)
        {
            int x=it.first;
            auto itr=m.find(x-1);
            if(itr!=m.end())
            {
                int count=itr->second+it.second;
                if(max<count)max=count;
            }
        }
        return max;
            
    }
};
class Solution {
public:
    int numberOfBeams(vector<string>& bank) {
        int pre=0;
        int res=0;
        for(int i=0;i<bank.size();i++)
        {
            int curr=0;
            for(int j=0;j<bank[0].size();j++)
            {
                if(bank[i][j]=='1')
                curr++;
            }
            res+=(pre*curr);
            if(curr!=0)
            pre=curr;
        }
        return res;
    }
};

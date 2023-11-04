class Solution {
public:
    int getLastMoment(int n, vector<int>& left, vector<int>& right) {
        
        int lmax=0;
        int rmax=0;
        for(int i=0;i<left.size();i++)
        {
            lmax=max(lmax,left[i]);
            // cout<<lmax<<endl;
        }
        
        for(int i=0;i<right.size();i++)
        {
            int d=abs(right[i]-n);
            rmax=max(rmax,d);
        }
        // cout<<lmax<<" "<<rmax<<endl;
        int ans=max(lmax,rmax);
        return ans;
    }
};
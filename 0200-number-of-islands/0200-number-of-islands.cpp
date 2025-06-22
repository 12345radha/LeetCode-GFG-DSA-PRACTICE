class Solution {
public:
    
    void dfs(int i,int j,vector<vector<char>> &grid,int m,int n)
    {
        if(i<0 || i>=n ||j<0 || j>=m || grid[i][j]=='0')
            return;
        grid[i][j]='0';
        dfs(i+1,j,grid,m,n);
        dfs(i-1,j,grid,m,n);
        dfs(i,j+1,grid,m,n);
        dfs(i,j-1,grid,m,n);
    }
    
    
    int numIslands(vector<vector<char>>& grid) {
        int n=grid.size();
        int m=grid[0].size();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    ans++;
                    dfs(i,j,grid,m,n);
                }
            }
        }
        return ans;
    }
};
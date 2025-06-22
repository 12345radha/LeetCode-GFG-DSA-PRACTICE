class Solution {
    private void DFS(int i,int j,char[][] grid)
    {
       if(i<0 || j>=grid[0].length || j<0 ||i>=grid.length || grid[i][j]=='0')return;
        grid[i][j]='0';//marking cell as visited

        // explore four direction
        DFS(i+1,j,grid);
        DFS(i-1,j,grid);
        DFS(i,j+1,grid);
        DFS(i,j-1,grid);

    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                   
                    DFS(i,j,grid);
                    ans++;
                }
            }
        }
        return ans;

    }
}
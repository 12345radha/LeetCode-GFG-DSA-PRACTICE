//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[][] grid = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution obj = new Solution();
            int ans = obj.MaxConnection(grid);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    
    private int dfs(int[][] grid, int i, int j, int n, int islandNo) {
    if (i < 0 || j < 0 || i >= n || j >= n || grid[i][j] == 0 || grid[i][j] == islandNo) {
        return 0;
    }
    
    grid[i][j] = islandNo;
    
    int a = dfs(grid, i - 1, j, n, islandNo);
    int b = dfs(grid, i, j - 1, n, islandNo);
    int c = dfs(grid, i + 1, j, n, islandNo);
    int d = dfs(grid, i, j + 1, n, islandNo);
    
    return 1+a+b+c+d;
}

    public int MaxConnection(int grid[][]) {
        // Your code here
        int n = grid.length;
    int islandNo = 2;
    
    Map<Integer, Integer> map = new HashMap<>();
    int ans = 0;
    
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            if (grid[i][j] == 1) {
                int size = dfs(grid, i, j, n, islandNo);
                map.put(islandNo, size);
                ans = Math.max(ans, size);
                islandNo++;
            }
        }
    }

        
        
         for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
            if (grid[i][j] == 0) {
                Set<Integer> set = new HashSet<>();
                int maxSize = 0;
                
                if (i > 0) {
                    set.add(grid[i - 1][j]);
                }
                if (i < n - 1) {
                    set.add(grid[i + 1][j]);
                }
                if (j > 0) {
                    set.add(grid[i][j - 1]);
                }
                if (j < n - 1) {
                    set.add(grid[i][j + 1]);
                }
                
                for (int s : set) {
                    maxSize += map.getOrDefault(s, 0);
                }
                
                maxSize++;
                ans = Math.max(maxSize, ans);
            }
        }
    }
    
    return ans;

    }
}
class Solution {
    private void dfsT(int sr, int sc, int newColor, int[][] image, int[][] vis, int n, int m, int oldColor) {
        if (sr < 0 || sc < 0 || sr >= n || sc >= m || vis[sr][sc] != -1 || image[sr][sc] != oldColor)
            return;

        vis[sr][sc] = newColor;

        dfsT(sr + 1, sc, newColor, image, vis, n, m, oldColor);
        dfsT(sr - 1, sc, newColor, image, vis, n, m, oldColor);
        dfsT(sr, sc + 1, newColor, image, vis, n, m, oldColor);
        dfsT(sr, sc - 1, newColor, image, vis, n, m, oldColor);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int n = image.length;
        int m = image[0].length;

        int[][] vis = new int[n][m];
        for (int i = 0; i < n; i++)
            Arrays.fill(vis[i], -1);

        dfsT(sr, sc, newColor, image, vis, n, m, image[sr][sc]);

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (vis[i][j] != -1)
                    image[i][j] = vis[i][j];

        return image;
    }
}

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    private void dfsT(int node,boolean[] vis,ArrayList<Integer> res,
    ArrayList<ArrayList<Integer>> adj)
    {
        vis[node]=true;
        res.add(node);
        
        for(Integer x:adj.get(node))
        {
            if(vis[x]==false)
            {
                dfsT(x,vis,res,adj);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int n=adj.size();
        boolean[] vis=new boolean[n];
        ArrayList<Integer> res=new ArrayList<>();
        
        dfsT(0,vis,res,adj);
        return res;
    }
}
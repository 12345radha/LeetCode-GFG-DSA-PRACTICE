class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        int n=adj.size();
        boolean[] vis=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> res=new ArrayList<>();
        
        q.add(0);
        vis[0]=true;
        
        while(!q.isEmpty())
        {
            int node=q.poll();
            res.add(node);
            
            for(Integer x:adj.get(node))
            {
                if(vis[x]==false)
                {
                    q.add(x);
                    vis[x]=true;
                }
            }
        }
        
        return res;
        
        
    }
}
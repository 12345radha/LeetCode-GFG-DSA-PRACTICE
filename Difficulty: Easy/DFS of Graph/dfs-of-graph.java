import java.util.*;

class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        boolean[] vis = new boolean[n];
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        st.push(0);

        while (!st.isEmpty()) {
            int node = st.pop();

            if (!vis[node]) {
                vis[node] = true;
                result.add(node);

                // Push neighbors in reverse order for DFS
                for (int i = adj.get(node).size() - 1; i >= 0; i--) {
                    int neighbor = adj.get(node).get(i);
                    if (!vis[neighbor]) {
                        st.push(neighbor);
                    }
                }
            }
        }

        return result;
    }
}

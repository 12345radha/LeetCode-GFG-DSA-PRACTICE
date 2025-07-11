import java.util.*;

class Solution {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;
        int maxDeadline = -1;
        
        // Job ID is just 1-based index
        int[] id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i + 1;
            maxDeadline = Math.max(maxDeadline, deadline[i]);
        }

        int[] assignedJobs = new int[maxDeadline + 1]; // slots from 1 to maxDeadline
        Arrays.fill(assignedJobs, -1);

        // Sort indices based on profit in descending order
        List<Integer> indexArr = new ArrayList<>();
        for (int i = 0; i < n; i++) indexArr.add(i);

        Collections.sort(indexArr, (a, b) -> profit[b] - profit[a]);

        int job = 0;
        int profits = 0;

        for (int i = 0; i < n; i++) {
            int idx = indexArr.get(i);
            for (int j = deadline[idx]; j > 0; j--) {
                if (assignedJobs[j] == -1) {
                    assignedJobs[j] = id[idx];
                    job++;
                    profits += profit[idx];
                    break;
                }
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(job);
        res.add(profits);

        return res;
    }
}

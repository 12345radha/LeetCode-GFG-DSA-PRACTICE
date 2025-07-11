// User function Template for Java

class Solution {
    static int assignMiceHoles(int N, int[] M, int[] H) {
        // code here
        Arrays.sort(H);
        Arrays.sort(M);
        
        int maxTime=0;
        for(int i=0;i<N;i++)
        {
            maxTime=Math.max(maxTime,Math.abs(H[i]-M[i]));
        }
        return maxTime;
    }
};
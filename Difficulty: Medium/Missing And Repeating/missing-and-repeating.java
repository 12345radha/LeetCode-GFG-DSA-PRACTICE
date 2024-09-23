//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int a[]) {
        // code here
        int n=a.length;
        int res1=0,res2=0;
        int[] b=new int[n+1];
        for(int i=0;i<n;i++)
        {
            b[a[i]]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(b[i]==2)
            res1=i;
            if(b[i]==0)
            res2=i;
        }
        int[] c = new int[]{res1,res2};
        return c;
    }
}
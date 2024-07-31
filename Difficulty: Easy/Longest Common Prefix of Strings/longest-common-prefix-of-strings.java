//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        if (arr == null || arr.length == 0) {
            return "";
        }
        
         String minStr = arr[0];
        for (String str : arr) {
            if (str.length() < minStr.length()) {
                minStr = str;
            }
        }


for (int i = minStr.length(); i > 0; i--) {
            String prefix = minStr.substring(0, i);
            boolean allMatch = true;
            for (String str : arr) {
                if (!str.startsWith(prefix)) {
                    allMatch = false;
                    break;
                }
            }
            if (allMatch) {
                return prefix;
            }
        }

        return "-1";
    }
}
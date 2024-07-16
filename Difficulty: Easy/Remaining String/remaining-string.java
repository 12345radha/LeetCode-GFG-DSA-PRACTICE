//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char ch = sc.next().charAt(0);
            int count = sc.nextInt();
            Solution ob = new Solution();
            String result = ob.printString(s, ch, count);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        String res="";
        char[] c=s.toCharArray();
        int index=-1;
        for(int i=0;i<s.length();i++)
        {
            if(c[i]==ch)
            count--;
            
            if(count==0)
            {
                index=i+1;
                break;
            }
        }
        
        if(index>=0 && index<s.length() ) res=s.substring(index);
        
        return res;
        
    }
}
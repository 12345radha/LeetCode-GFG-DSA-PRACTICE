class Solution {
    public String reverseWords(String s) {
       StringBuilder res=new StringBuilder();
       int i=s.length()-1;
       while(i>=0 && s.charAt(i)==' ')i--;
       
       while(i>=0)
       {
         int j=i;
         while(j>=0 && s.charAt(j)!=' ')j--;
         
         for(int k=j+1;k<=i;k++)
         {
             res.append(s.charAt(k));
         }
         res.append(' ');
         i=j-1;
         while(i>=0 && s.charAt(i)==' ')i--;
       }
       res.deleteCharAt(res.length()-1);
       

       return new String(res);
       
    }
}
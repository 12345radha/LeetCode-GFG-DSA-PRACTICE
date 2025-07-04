class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
         char[] a1=s.toCharArray();
         char[] a2=t.toCharArray();
         Arrays.sort(a1);
         Arrays.sort(a2);

        //  if(a1==a2)return true; --> compare reference
         return Arrays.equals(a1, a2);
    }
}
class Solution {
    public int distributeCandies(int[] c) {
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<c.length;i++)
        {
               st.add(c[i]);
        }
        int d=c.length/2;
        int l=st.size();
        if(d>l)return l;
         return d;
    }
}
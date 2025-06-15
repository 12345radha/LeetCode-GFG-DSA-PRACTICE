class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st=new Stack<>();
        int index=-1;
        String res="";
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                st.push(word.charAt(i));
              index=i;
              break;
            }
            else{
                st.push(word.charAt(i));
            }
        }
        if(index==-1)return word;
        while(!st.isEmpty())
        {
            res=res+st.peek();
            st.pop();
        }
        res=res+word.substring(index+1,word.length());
        return res;
    }
}
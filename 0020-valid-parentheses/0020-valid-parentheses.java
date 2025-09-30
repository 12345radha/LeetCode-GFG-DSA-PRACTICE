class Solution {
    public boolean isValid(String s) {
         char[] a=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=a[i];
            if(a[i]=='(' || a[i]=='{' || a[i]=='[')
            st.push(c);
            else{
                if(!st.isEmpty()){
                     if(c==')' && st.peek()=='(') st.pop();
                else if(c=='}' && st.peek()=='{')st.pop();
                else if(c==']' && st.peek()=='[')st.pop();
                else return false;
                }
                else return false;
                
            }
        }

            if(st.isEmpty())return true;
            return false;

        
    }
}
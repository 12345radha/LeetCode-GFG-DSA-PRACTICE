class Solution {
    public int canBeTypedWords(String text, String b) {
        
        String[] a=text.split(" ");
        int cnt=0;
       for(int i=0;i<a.length;i++)
       {
          boolean flag=true;
          for(char c:b.toCharArray())
          {
            if(a[i].contains(""+c))flag=false;
          }
          if(flag==true)cnt++;
       }
       return cnt;

    }
}
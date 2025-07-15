class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)return false;
        boolean isNum=false;
        boolean isConst=false;
        boolean isVowel=false;
        int cnt=0;
      for(int i=0;i<word.length();i++)
      {
        char c=word.charAt(i);
        if(c=='@' || c=='#'|| c=='$')return false;
        else if(c>='0' && c<='9'){isNum=true;cnt++;}
        else if(c=='a' || c=='A' || c=='e' ||c=='E' || c=='i'||c=='I' ||c=='o'||c=='O'||c=='u'||c=='U')
        {
           isVowel=true;
           cnt++;
        }
        else
        {
             isConst=true;
             cnt++;
        }
      }
      
      if((isNum==true && isVowel==true && isConst==true)||(isVowel==true && isConst==true))
      return true;
      return false;
    }
}
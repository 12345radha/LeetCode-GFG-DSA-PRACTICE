class Solution {
    public void reverS(char[] a,int i,int j)
    {
        while(i<=j)
        {
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
       return;
    }
    public String finalString(String s) {
        int n=s.length();
        char[] b=s.toCharArray();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
         if(b[i]=='i')
         a.add(i);
         for(int i=0;i<a.size();i++)
         {
            reverS(b,0,a.get(i)-1);
         }
         StringBuilder result = new StringBuilder();
        for (int i = 0; i < b.length; i++) {
            if (b[i] != 'i') {
                result.append(b[i]);
            }
        }

        return result.toString();
     
    }
}
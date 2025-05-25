class Solution {
    public List<String> stringMatching(String[] words) {
        int n=words.length;
        List<String> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String s=words[i];
            for(int j=0;j<n;j++)
            {
                if(words[j].contains(s)&& i!=j){
                    res.add(s);
                    break;
                }
            }

        }
        return res;
    }
}
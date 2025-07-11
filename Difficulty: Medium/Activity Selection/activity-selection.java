
class Solution {
    public int activitySelection(int[] start, int[] end) {
        // code here
        int n=start.length;
        List<Integer> indexArray=new ArrayList<>();
        for(int i=0;i<n;i++)
        indexArray.add(i);
        
        // ascendong order
        Collections.sort(indexArray,(a,b)->end[a]-end[b]);
        int last=end[indexArray.get(0)];
        int cnt=1;
        
        for(int i=1;i<n;i++)
        {
           int index= indexArray.get(i);
           if(start[index]>last)
           {
               cnt++;
               last=end[index];
           }
        }
        
        return cnt;
        
    }
}

class Solution {
    public int eraseOverlapIntervals(int[][] arr) {

      Arrays.sort(arr,(a,b)->a[1]-b[1]);
      int removed=0;
      int last=arr[0][1];
      for(int i=1;i<arr.length;i++)
      {
        if(last>arr[i][0])removed++;
        else
        {
            last=arr[i][1];
        }
      }
      return removed;

        
    }
}
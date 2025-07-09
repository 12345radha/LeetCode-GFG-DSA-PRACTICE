class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int freq=n/4;
        int i=0;
        while(i<n)
        {
            int j=i;
            int cnt=0;
            while(j<n)
            {
                if(arr[j]!=arr[i])break;
                cnt++;
                j++;
            }
            if(cnt>freq)
                return arr[i];
            i=j;
        }
        return -1;
      
    }
}
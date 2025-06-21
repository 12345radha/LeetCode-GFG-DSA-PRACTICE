class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int fm=arr[0];
        int sm=-1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>fm)
            {
                sm=fm;
                fm=arr[i];
            }
            else if(arr[i]<fm && arr[i]>sm)
            {
                sm=arr[i];
            }
        }
        return sm;
        
    }
}
class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int sidx=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[sidx]){
                    sidx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[sidx];
            arr[sidx]=temp;
           
        }
        
    }
}
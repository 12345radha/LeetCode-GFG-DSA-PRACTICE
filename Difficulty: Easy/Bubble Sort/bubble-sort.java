class Solution {
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int a[]) {
        // code here
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            boolean isswap=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    isswap=true;
                }
            }
            if(isswap==false)return;
        }
    }
}
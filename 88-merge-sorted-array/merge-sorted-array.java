class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int[] a=new int[m+n];
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                a[k]=nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]){a[k]=nums2[j]; j++;}
            k++;
        }

        while(i<m)
        {
            a[k]=nums1[i];
            i++;
            k++;
        }

        while(j<n)
        {
            a[k]=nums2[j];
            j++;
            k++;
        }

        for(int p=0;p<m+n;p++)
        nums1[p]=a[p];
    }
}
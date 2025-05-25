class Solution {
    public void rotate(int[] nums, int k) {
      int[] a=new int[nums.length];

    int n=nums.length;
      for(int i=0;i<nums.length;i++)
      {
        int d=(i+k)%n;
        a[d]=nums[i];
      }  

      for(int i=0;i<n;i++)
      nums[i]=a[i];
    }
}
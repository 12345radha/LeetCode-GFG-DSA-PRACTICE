class Solution {
    public boolean positive(int[] a,int k)
    {
         for(int i=0; i<a.length-1; i++){
            if(a[i] == -1){
                if(k <=0) return false;
                a[i] *= -1;
                a[i+1] *= -1;
                k--;
            }
        }
        for(int num : a){
            if(num == -1) return false;
        }
        return true;
    }

    public boolean negative(int[] a,int k)
    {
         for(int i=0; i<a.length-1; i++){
            if(a[i] == 1){
                if(k <=0) return false;
                a[i] *= -1;
                a[i+1] *= -1;
                k--;
            }
        }
        for(int num : a){
            if(num == 1) return false;
        }
        return true;
    }

    public boolean canMakeEqual(int[] nums, int k) {
        int n=nums.length;
        int[] a=nums.clone();
        int[] b=nums.clone();
        int n1=k, n2=k;
        return positive(a,n1) || negative(b,n2);


    }
}
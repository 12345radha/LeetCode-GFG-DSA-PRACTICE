class Solution {
    public boolean isPowerOfTwo(int n) {
        int num=n;
        int power=1;
        while(num>=2)
        {
            num/=2;
            power*=2;
        }
        if(power==n)return true;
        return false;
    }
}
class Solution {
    public boolean isPowerOfFour(int n) {
        int power=1;
        int num=n;
        while(num>=4)
        {
            num/=4;
            power*=4;
        }
        if(power==n)return true;
        return false;
    }
}
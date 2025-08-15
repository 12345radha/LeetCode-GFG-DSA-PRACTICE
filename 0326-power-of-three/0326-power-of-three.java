class Solution {
    public boolean isPowerOfThree(int n) {
         int num=n;
        int power=1;
        while(num>=3)
        {
            num/=3;
            power*=3;
        }
        if(power==n)return true;
        return false;
    }
}
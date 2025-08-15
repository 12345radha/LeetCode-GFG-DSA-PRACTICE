class Solution {
    public boolean checkPowersOfThree(int n) {
        int power = 1;
        while (power * 3 <= n) {
            power *= 3;
        }
        // Subtract powers of three from n
        while (n > 0 && power > 0) {
            if (n >= power) {
                n -= power; // Subtract the largest power of three
            }
            power /= 3; // Move to the next smaller power of three
        }
        // If n becomes 0, it can be expressed as a sum of distinct powers of three
        return n == 0;  
    }
}
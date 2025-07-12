class Solution {
    public String addStrings(String num1, String num2) {
        char[] a = num1.toCharArray();
        char[] b = num2.toCharArray(); // ✅ fixed here
        int carry = 0;
        StringBuilder res = new StringBuilder();
        int i = a.length - 1, j = b.length - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) {
                sum += (b[j] - '0');
                j--; 
            }
            if (i >= 0) {
                sum += (a[i] - '0');
                i--; 
            }

            res.append(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) res.append(carry);
        return res.reverse().toString();
    }
}

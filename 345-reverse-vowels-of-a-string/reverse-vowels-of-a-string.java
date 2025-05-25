class Solution {
    public String reverseVowels(String s) {
        char[] a=s.toCharArray();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' ||
    a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U')

            list.add(i);
        }
       int l = 0, r = list.size() - 1;
        while (l < r) {
            int leftIndex = list.get(l);
            int rightIndex = list.get(r);

            char c = a[leftIndex];
            a[leftIndex] = a[rightIndex];
            a[rightIndex] = c;

            l++;
            r--;
        }

       return new String(a);

    }
}
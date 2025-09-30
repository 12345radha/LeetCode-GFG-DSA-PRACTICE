class Solution {
    public String largestNumber(int[] nums) {

        String[] a=new String[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            a[i]=String.valueOf(nums[i]);
        }

        Arrays.sort(a,(b,c)->(c+b).compareTo(b+c));
        if(a[0].charAt(0)=='0')return "0";
        StringBuilder sb=new StringBuilder();
        for(String x:a)sb.append(x);

        return new String(sb);
        
    }
}
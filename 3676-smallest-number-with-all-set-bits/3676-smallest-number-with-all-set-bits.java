class Solution {
    public int smallestNumber(int n) {
        int num=n;
        int cnt=0;
        int pow=1;


        while(n>1)
        {
            cnt++;
            n/=pow;
            pow=pow*2;
        }

        int res=0;
        int p=1;
        for(int i=0;i<cnt;i++)
        {
            res+=p;
            p*=2;
        }
        while(res<num)
        {
            res+=p;
            p*=2;
        }

        return res;

    }
}
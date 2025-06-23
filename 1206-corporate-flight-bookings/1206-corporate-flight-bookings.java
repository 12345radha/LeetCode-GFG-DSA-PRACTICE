class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] pre=new int[n+2];
        for(int i=0;i<bookings.length;i++)
        {
            int first=bookings[i][0];
            int last=bookings[i][1];
            int seat=bookings[i][2];
            pre[first]+=seat;
            pre[last+1]-=(seat);
        }
        int[] res=new int[n];
        // int j=0;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=pre[i];
              res[i-1]=sum;
              
        }
        return res;
    }
}
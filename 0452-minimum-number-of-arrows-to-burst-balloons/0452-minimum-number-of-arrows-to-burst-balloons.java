class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->(a[1]<=b[1])?-1:1);
        int arrow=1;
        int lastPoint=points[0][1];
        for(int i=1;i<points.length;i++)
        {
             if(points[i][0]>lastPoint){
                lastPoint=points[i][1];
                arrow++;
             }

        }return arrow;
    }
}
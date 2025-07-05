class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int x:nums)
        {
            if(mp.containsKey(x))mp.put(x,mp.get(x)+1);
            else mp.put(x,1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>
        ((a,b)-> b.getValue()-a.getValue());

       pq.addAll(mp.entrySet());
        int[] res = new int[k];

       int i=0;
        while(!pq.isEmpty() && k>0)
        {
            Map.Entry<Integer,Integer> entry=pq.poll();
           res[i]=entry.getKey();
           i++;
           k--;
        }

        return res;
    }
}
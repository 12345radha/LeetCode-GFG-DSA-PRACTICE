class FindSumPairs {
    int[] a;
    int[] b;
    Map<Integer, Integer> freqB = new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        a = nums1;
        b = nums2;

        for (int val : b) {
            freqB.put(val, freqB.getOrDefault(val, 0) + 1);
        }
    }

    public void add(int index, int val) {
        int oldVal = b[index];
        freqB.put(oldVal, freqB.get(oldVal) - 1); // Decrease old value frequency

        b[index] += val;
        int newVal = b[index];
        freqB.put(newVal, freqB.getOrDefault(newVal, 0) + 1); // Increase new value frequency
    }

    public int count(int tot) {
        int cnt = 0;
        for (int x : a) {
            cnt += freqB.getOrDefault(tot - x, 0);
        }
        return cnt;
    }
}

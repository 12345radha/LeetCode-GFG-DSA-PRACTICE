class TimeMap {
    Map<String,TreeMap<Integer,String>> mp;
    
    public TimeMap() {
        mp=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        
        if (mp.containsKey(key)) {
            mp.get(key).put(timestamp, value);
        } else {
            mp.put(key, new TreeMap<>());
            mp.get(key).put(timestamp, value);
        }
    }
    
    public String get(String key, int timestamp) {
       if (mp.containsKey(key)) {
        TreeMap<Integer, String> tree = mp.get(key);
        Map.Entry<Integer, String> entry = tree.floorEntry(timestamp);
        if (entry != null) return entry.getValue();
    }
    return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
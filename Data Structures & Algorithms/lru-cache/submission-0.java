class LRUCache {
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!hm.containsKey(key)) return -1;
        int val = hm.remove(key); 
        hm.put(key, val);          
        return val;
    }

    public void put(int key, int value) {
        if (hm.containsKey(key)) {
            hm.remove(key);   
        } else if (hm.size() == capacity) {
            int eldest = hm.keySet().iterator().next();  
            hm.remove(eldest);
        }
        hm.put(key, value);
    }
}
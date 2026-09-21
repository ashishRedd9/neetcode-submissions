class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<>());
            }
            hm.get(key).add(strs[i]);
        }

        
        List<List<String>> lst=new ArrayList<>(hm.values());
        return lst;
    }
}

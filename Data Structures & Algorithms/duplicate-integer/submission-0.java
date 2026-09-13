class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int x : nums){
            if(hm.containsKey(x)){
                hm.put(x,hm.get(x)+1);
            }
            else{
                hm.put(x,1);
            }
        }

        for(Map.Entry<Integer,Integer> result : hm.entrySet()){
            if(result.getValue()>=2){
                return true;
            }
        }

        return false;
    }
}

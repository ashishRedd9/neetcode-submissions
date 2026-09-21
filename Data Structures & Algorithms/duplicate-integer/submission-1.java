class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num : nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        boolean flag=false;
        for(Map.Entry<Integer,Integer> res : hm.entrySet()){
            if(res.getValue()>1){
                flag=true;
                break;
            }
        }

        return flag ? true : false;
    }
}
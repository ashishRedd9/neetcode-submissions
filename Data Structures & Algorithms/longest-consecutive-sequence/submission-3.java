class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==1 && nums[0]==0)return 1;
        int maxLen=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }

        for(int x : hs){

            if(!hs.contains(x-1)){
                int len=1;
                int curr=x;
                while(hs.contains(curr+1)){
                    curr++;
                    len++;
                    
                }
                maxLen=Math.max(maxLen,len);
            }
        }

        return maxLen;
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        int len=nums.length;
        prefix[0]=1;
        for(int i=1;i<nums.length;i++){

            prefix[i]=prefix[i-1]*nums[i-1];
        }

        
        suffix[len-1]=1;
        for(int i=len-2;i>=0;i--){

            suffix[i]=suffix[i+1]*nums[i+1];
        }

        int[] res=new int[len];
        for(int i=0;i<len;i++){
            res[i]=prefix[i]*suffix[i];
        }

        return res;
    }
}  

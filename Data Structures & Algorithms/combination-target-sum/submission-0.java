class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> lst=new ArrayList<>();

        solve(nums,0,target,lst,new ArrayList<>());
        return lst;
    }

    private static void solve(int[] nums,int index,int target,List<List<Integer>> lst,List<Integer> temp){

        if(target==0){
            lst.add(new ArrayList<>(temp));
            return;
        }

        if(index>=nums.length || target<0){
            return;
        }

        temp.add(nums[index]);
        solve(nums,index,target-nums[index],lst,temp);
        temp.remove(temp.size()-1);
        solve(nums,index+1,target,lst,temp);
        
    }
}

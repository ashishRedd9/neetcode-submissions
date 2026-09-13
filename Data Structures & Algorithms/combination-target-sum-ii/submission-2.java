class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> lst=new HashSet<>();
        Arrays.sort(candidates);
        solve(candidates,0,target,lst,new ArrayList<>());

        return new ArrayList<>(lst);
    }

    private static void solve(int[] nums,int index,int target,Set<List<Integer>> lst,List<Integer> temp){

        if(target==0){
            lst.add(new ArrayList<>(temp));
            return;
        }

        for(int i=index;i<nums.length;i++){

            
            if(i>index && nums[i]==nums[i-1])continue;
            if(nums[i]>target)break;

            temp.add(nums[i]);
            solve(nums,i+1,target-nums[i],lst,temp);
            temp.remove(temp.size()-1);

        }
    }
}

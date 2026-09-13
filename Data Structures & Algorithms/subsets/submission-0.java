class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lst=new ArrayList<>();
        solve(nums,0,new ArrayList<>(),lst);
        return lst;
    }

    private void solve(int[] nums,int index,List<Integer> temp,List<List<Integer>> lst){
        
        lst.add(new ArrayList<>(temp));

        for(int i=index;i<nums.length;i++){

            temp.add(nums[i]);
            solve(nums,i+1,temp,lst);
            temp.remove(temp.size()-1);
        }
    }
}

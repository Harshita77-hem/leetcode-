class Solution {
    public void solve(int[] nums,int index,int target,List<Integer> current,List<List<Integer>> ans){
        if(index==nums.length){
            if(target==0){
                ans.add(new ArrayList<>(current));
            }
            return;
        }
        if(nums[index]<=target){
            current.add(nums[index]);
            solve(nums,index,target-nums[index],current,ans);

            current.remove(current.size()-1);

        }
        solve(nums,index+1,target,current,ans);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> current=new ArrayList<>();

        solve(nums,0,target,current,ans);
        return ans;
        
    }
}
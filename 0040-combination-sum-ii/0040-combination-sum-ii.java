class Solution {
    public void solve(int[] nums,int index,int target,List<Integer> current,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]>target){
                break;
            }
            current.add(nums[i]);
            solve(nums,i+1,target-nums[i],current,ans);

            current.remove(current.size()-1);

        }
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> current=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        solve(nums,0,target,current,ans);
        return ans;
        
    }
}
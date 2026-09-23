class Solution {
    public void solve(int[] nums,boolean[] freq,List<Integer> ds,List<List<Integer>> ans){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[i]==false){
                freq[i]=true;
                ds.add(nums[i]);
                solve(nums,freq,ds,ans);

                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        solve(nums,freq,ds,ans);
        return ans;
        
    }
}
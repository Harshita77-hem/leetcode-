class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(1,k,n,new ArrayList<>(),ans);
        return ans;
        
    }
    public void solve(int start,int k,int n,List<Integer> current,List<List<Integer>> ans){
        if(current.size()==k && n==0){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(current.size()==k || n<0){
            return;
        }
        for(int i=start;i<=9;i++){
            current.add(i);
            solve(i+1,k,n-i,current,ans);
            current.remove(current.size()-1);
        }
    }
}
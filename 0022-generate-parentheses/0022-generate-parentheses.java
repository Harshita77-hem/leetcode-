class Solution {
    List<String> result=new ArrayList<>();
    public void solve(String curr,int open,int close,int n){
        if(curr.length()==2*n){
            result.add(curr);
            return;

        }
        if(open<n){
            solve(curr+"(",open+1,close,n);

        }
        if(close<open){
            solve(curr+")",open,close+1,n);
        }
    }
    public List<String> generateParenthesis(int n) {
        solve("",0,0,n);
        return result;
        
    }
}
class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int ans=0;
        int n=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(ch);
                n++;
                ans=Math.max(n,ans);
            }
            else if(ch==')'){
                st.pop();
                n--;
            }


        }
        return ans;
        
    }
}
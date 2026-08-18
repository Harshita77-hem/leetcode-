class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(!st.empty()){
                    ans+=ch;
                }
                st.push(ch);

            }
            else if(ch==')'){
                if(st.size()>1){
                    ans+=ch;


                }
                st.pop();

            }
           
           

        }
        return ans;
        
    }
}
class Solution {
    String[] keypad={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String s) {
        List<String> ans=new ArrayList<>();
        possibleindex(s,"",ans);
        return ans;
        
    }
    public  void possibleindex(String s,String current,List<String> ans){
        if(s.length()==0){
            ans.add(current);
            return;
        }
        String key=keypad[s.charAt(0)-48];
        for(int i=0;i<key.length();i++){
            possibleindex(s.substring(1),current+key.charAt(i),ans);
           
        }


    }
}
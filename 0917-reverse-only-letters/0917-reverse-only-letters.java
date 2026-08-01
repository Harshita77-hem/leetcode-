class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder letters=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                letters.append(ch);
            }
        }
        letters.reverse();
        StringBuilder ans=new StringBuilder();
        int index=0;
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                ans.append(letters.charAt(index));
                index++;
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
        
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        String clean="";
        for(int i=0;i<s.length();i++){
            char ch=Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(ch)){
                clean+=ch;
            }

                

            
        }
        String rev="";
        for(int i=clean.length()-1;i>=0;i--){
            rev+=clean.charAt(i);

        }
        return clean.equals(rev);
        
    }
}
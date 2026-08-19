class Solution {
    public int myAtoi(String s) {
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        int sign=1;
        if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                sign=-1;
                

            }
            i++;
        }
        long res=0;
        while(i<s.length() && (s.charAt(i)>='0' && s.charAt(i)<='9')){
            res=res*10+(s.charAt(i)-'0');
            if(res*sign > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(res*sign<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(res*sign);



        
    }
}
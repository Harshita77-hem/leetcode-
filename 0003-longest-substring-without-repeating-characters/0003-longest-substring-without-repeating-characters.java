class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[256];
            for(int j=i;j<s.length();j++){
                if(freq[s.charAt(j)]==1){
                    break;
                }
                freq[s.charAt(j)]++;
                maxlen=Math.max(maxlen,j-i+1);
            }
        }
        return maxlen;
        
    }
}
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq=new int[26];
        for(char ch:word1.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:word2.toCharArray()){
            freq[ch-'a']--;
        }
        for(int x:freq){
            if(Math.abs(x)>3){
                return false;
            }
        }
        return true;
        
    }
}
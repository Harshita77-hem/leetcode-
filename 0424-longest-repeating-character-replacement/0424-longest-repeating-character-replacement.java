class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int[] hash=new int[26];
        int l=0,r=0,maxlen=0,maxfreq=0;
        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq,hash[s.charAt(r)-'A']);
            while((r-l+1)-maxfreq>k){
                hash[s.charAt(l)-'A']--;
                l++;
                maxfreq=0;
                for(int i=0;i<26;i++){
                    maxfreq=Math.max(maxfreq,hash[i]);
                    
                }
            }
            if((r-l+1)-maxfreq<=k){
                maxlen=Math.max(maxlen,(r-l+1));
            }
            r++;
        }
        return maxlen;
        
    }
}
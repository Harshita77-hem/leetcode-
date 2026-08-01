class Solution {
    public boolean isvowel(char ch){
        return (ch=='a'|| ch=='e' || ch=='i'|| ch=='o' || ch=='u');
    }
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            String word=words[i];
            char first=word.charAt(0);
            char last=word.charAt(word.length()-1);
            if(isvowel(first) && isvowel(last)){
                count++;
            }
        }
        return count;

        
    }
}
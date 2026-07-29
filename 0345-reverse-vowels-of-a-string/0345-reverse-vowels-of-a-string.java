class Solution {
    public boolean isvowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u';
    }
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !isvowel(s.charAt(left))){
                left++;
            }
            while(left<right && !isvowel(s.charAt(right))){
                right--;

            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);

        
    }
}
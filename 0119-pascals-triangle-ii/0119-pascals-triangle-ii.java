class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        int n=rowIndex;
        long ele=1;
        ans.add((int)ele);
       for(int i=0;i<n;i++){
          ele=ele*(n-i);
          ele=ele/(i+1);
          ans.add((int)ele);
       }
       return ans;

        
    }
}
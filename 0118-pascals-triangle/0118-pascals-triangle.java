class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
       
       
        for(int row=1;row<=numRows;row++){
            List<Integer> temp=new ArrayList<>();
            int ele=1;
            temp.add(ele);
            for(int i=0;i<row-1;i++){
                ele=ele*(row-1-i);
                ele=ele/(i+1);
                temp.add(ele);
            }
            ans.add(temp);

        }
        return ans;
        
    }
}
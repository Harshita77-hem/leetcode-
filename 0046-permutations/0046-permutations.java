class Solution {
    public static void solve(int[] nums,int index,List<List<Integer>> ans){
        if(index==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            ans.add(temp);
            return;
        }
        for(int i=index;i<nums.length;i++){
            int temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;

            solve(nums,index+1,ans);

            temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(nums,0,ans);
        return ans;
        
    }
}
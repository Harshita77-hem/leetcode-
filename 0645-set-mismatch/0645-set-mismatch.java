class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] hash=new int[n+1];
        int repeating=-1;
        int missing=-1;
        for(int i=0;i<n;i++){
            hash[nums[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(hash[i]==0) missing=i;
            else if(hash[i]==2) repeating=i;
            else if(missing!=-1 && repeating!=-1){
                break;
            }
        }
        return new int[] {repeating,missing};
        
    }
}
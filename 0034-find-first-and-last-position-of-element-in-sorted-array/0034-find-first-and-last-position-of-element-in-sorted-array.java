class Solution {
    public int lowerbound(int[] nums,int target){
        int n=nums.length;
        int ans=n;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
    public int upperbound(int[] nums,int target){
        int n=nums.length;
        int ans=n;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int lb=lowerbound(nums,target);
        if(lb==nums.length || nums[lb]!=target){
            return new int[] {-1,-1};
        }
        int ub=upperbound(nums,target);
        return new int[] {lb,ub-1};
        
    }
}
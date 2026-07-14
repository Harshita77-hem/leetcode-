class Solution {
    public int maxele(int[] nums){
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    public int calculate(int[] nums,int divisor){
        int n=nums.length;
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum+=(nums[i]+divisor-1)/divisor;

        }
        return totalsum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        if(threshold<nums.length){
            return -1;
        }
        int low=1;
        int high=maxele(nums);
        while(low<=high){
            int mid=(low+high)/2;
            int reqans=calculate(nums,mid);

            if(reqans<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
        
    }
}
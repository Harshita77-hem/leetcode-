class Solution {
    public boolean cansplit(int[] nums,int k,int maxsum){
        int parts=1;
        int sum=0;
        for(int num:nums){
            if(sum+num<=maxsum){
                sum+=num;
            }
            else{
                parts++;
                sum=num;
            }
        }
        return parts<=k;
    }
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        for(int num:nums){
            low=Math.max(low,num);
            high+=num;
        }
        while(low<high){
            int mid=(low+high)/2;
            if(cansplit(nums,k,mid)){
                high=mid;
            }
            else{
                low=mid+1;

            }
        }
        return low;
       

        
    }
}
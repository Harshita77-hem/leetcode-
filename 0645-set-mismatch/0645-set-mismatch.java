class Solution {
    public int[] findErrorNums(int[] nums) {
        long n=nums.length;
        long S=(n*(n+1))/2;
        long Sn=(n*(n+1)*(2*n+1))/6;
        long S1=0,S2=0;
        for(int i=0;i<n;i++){
            S1+=nums[i];
            S2+=(long) nums[i]*nums[i];
        }
        long val1=S1-S;
        long val2=S2-Sn;
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=x-val1;
        return new int[] {(int)x,(int)y};
        
    }
}
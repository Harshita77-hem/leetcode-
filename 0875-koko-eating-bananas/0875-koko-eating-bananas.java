class Solution {
    public int maxele(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    public long timecompute(int[] arr,int speed){
        int n=arr.length;
        long totalhr=0;
        for(int i=0;i<n;i++){
            totalhr+=(arr[i]+speed-1)/speed;
        }
        return totalhr;
    }

    public int minEatingSpeed(int[] arr, int h) {
      
      
        int low=1;
        int high=maxele(arr);
        while(low<=high){
            int mid=(low+high)/2;
            long reqtime=timecompute(arr,mid);
            if(reqtime<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
            
           
        }
        return low;

        
    }
}
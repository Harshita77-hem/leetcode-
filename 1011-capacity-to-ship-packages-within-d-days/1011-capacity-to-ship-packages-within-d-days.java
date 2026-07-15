class Solution {
    public int countdays(int[] weights,int capacity){
        int days=1;
        int load=0;
        for(int weight:weights){
            if(load+weight>capacity){
                days++;
                load=weight;
            }
            else{
                load+=weight;
            }
        }
        return days;

    }
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int w:weights){
            sum+=w;
            max=Math.max(max,w);
        }
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            if(countdays(weights,mid)<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
           
           
            
            
        
        

        
    }
}
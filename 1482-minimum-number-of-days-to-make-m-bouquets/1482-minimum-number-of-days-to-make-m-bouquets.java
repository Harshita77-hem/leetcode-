class Solution {
    public int minele(int[] arr){
        int n=arr.length;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            min=Math.min(min,arr[i]);
   
        }
        return min;
    }
    public int maxele(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    public boolean possible(int[] arr,int days,int m,int k){
        int count=0;
        int bouquet=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=days){
                count++;
            }
            else{
                
                bouquet+=count/k;
                count=0;
            }
           
        }
        bouquet+=count/k;
        return bouquet>=m;
    }

    public int minDays(int[] arr, int m, int k) {
        if((long) m*k>arr.length){
            return -1;
        }
        int low=minele(arr);
        int high=maxele(arr);
        while(low<=high){

            int mid=low+(high-low)/2;
            if(possible(arr,mid,m,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
        
    }
}
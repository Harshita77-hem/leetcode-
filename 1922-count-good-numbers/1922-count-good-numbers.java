class Solution {
    
    static final long N = 1000000007;
    public long power(long x,long n){
        if(n==0){
            return 1;
        }
        long ans=power(x,n/2);
        ans=(ans*ans)%N;
        if(n%2==1){
            ans=(ans*x)%N;
        }
        return ans;
    }
    
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=(n/2);
        long ans=((power(5,even))*(power(4,odd)))%N;
        return (int) ans;
        
        

        
    }
}
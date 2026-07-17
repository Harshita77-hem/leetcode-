class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n1=a.length;
        int n2=b.length;
        int i=0;
        int j=0;
        int[] c=new int[n1+n2];
        int k=0;
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
            
        }
        while(i<n1){
            c[k++]=a[i++];
        }
        while(j<n2){
            c[k++]=b[j++];
        }
        int n=n1+n2;
        if(n%2==1){
            return c[n/2];
        }
        else{
            return (c[n/2]+(c[(n/2)-1]))/2.0;
        }
    }
}
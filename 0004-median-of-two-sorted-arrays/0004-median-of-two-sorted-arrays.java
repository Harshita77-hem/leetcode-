class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n1=a.length;
        int n2=b.length;
        int n=n1+n2;
        int cnt=0;
        int i=0;
        int j=0;
       
       
        int idx2=n/2;
        int idx1=idx2-1;
        int ele1=-1;
        int ele2=-1;
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                if(cnt==idx1) ele1=a[i];
                if(cnt==idx2) ele2=a[i];
                i++;
                cnt++;
            }
            else{
                if(cnt==idx1) ele1=b[j];
                if(cnt==idx2) ele2=b[j];
                j++;
                cnt++;
            }

        }
        while(i<n1){
            if(cnt==idx1) ele1=a[i];
            if(cnt==idx2) ele2=a[i];
            i++;
            cnt++;

        }
        while(j<n2){
            if(cnt==idx1) ele1=b[j];
            if(cnt==idx2) ele2=b[j];
            j++;
            cnt++;
        }
        if(n%2==1){
            return ele2;
        }
        else{
            return (ele1+ele2)/2.0;
        }
        
    }
}
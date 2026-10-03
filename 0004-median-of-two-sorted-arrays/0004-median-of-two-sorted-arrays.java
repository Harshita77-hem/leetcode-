class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int idx2=n/2;
        int idx1=idx2-1;
        int ele1=0;
        int ele2=0;
        int i=0;
        int j=0;
        int cnt=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                if(cnt==idx1) ele1=nums1[i];
                if(cnt==idx2) ele2=nums1[i];
                cnt++;
                i++;
            }
            else{
                if(cnt==idx1) ele1=nums2[j];
                if(cnt==idx2) ele2=nums2[j];
                cnt++;
                j++;
            }
        }
        while(i<n1){
            if(cnt==idx1) ele1=nums1[i];
            if(cnt==idx2) ele2=nums1[i];
            cnt++;
            i++;
        }
        while(j<n2){
            if(cnt==idx1) ele1=nums2[j];
            if(cnt==idx2) ele2=nums2[j];
            cnt++;
            j++;

        }
        if(n%2==1){
            return ele2;
        }
        else{
            return (ele1+ele2)/2.0;
        }
        
    }
}
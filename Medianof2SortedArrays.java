import java.util.Arrays;
class MedianOf2SortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m= nums2.length;
        int ar[]= new int[n+m];
        int j=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=nums1[i];
        }
        for(int i=n;i<n+m;i++)
        {
            ar[i]=nums2[j];
            j++;
        }
        Arrays.sort(ar);
        if((n+m)%2==0)
        {
            int k=(n+m)/2;
            int l=k-1;
            int a1=ar[k];
            int a2=ar[l];
            double ans=(a1+a2)/2.0;
            return ans;
        }
        else
        return ar[(n+m)/2];
    }
}

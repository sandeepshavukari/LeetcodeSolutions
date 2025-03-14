public class SerchInRotatedSortedArray {
    //solution using linear serch
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            return i;
        }
        return -1;
    }

    //solution using binary serch
    int l=0,h=ar.length-1;
    while(l<=h)
    {
        int m=(l+h)/2;
        if(ar[m]==key)
        return m;
        if(ar[m]>=ar[l])
        {
            if(ar[m]>=key&&ar[l]<=key)
            h=m-1;
            else
            l=m+1;
        }
        else
        {
            if(ar[m]<=key&&ar[h]>=key)
            l=m+1;
            else
            h=m-1;
        }
    }
    return -1;
}

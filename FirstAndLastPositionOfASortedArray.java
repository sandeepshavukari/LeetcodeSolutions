public class FirstAndLastPositionOfASortedArray {
    public static int ub(int ar[],int key)
    {
        int l=0,h=ar.length-1,a=ar.length,m;
        while(l<=h)
        {
            m=l+(h-l)/2;
            if(ar[m]>key)
            {
                a=m;
                h=m-1;
            }
            else 
            {
                l=m+1;
            }
        }
        return a; 
    }
    public static int lb(int ar[],int key)
    {
        int l=0,h=ar.length-1,a=ar.length,m;
        while(l<=h)
        {
            m=l+(h-l)/2;
            if(ar[m]>=key)
            {
                a=m;
                h=m-1;
            }
            else 
            {
                l=m+1;
            }
        }
        return a; 
    }
    public int[] searchRange(int[] nums, int target) {
       int f =lb(nums, target);
        int l=ub(nums, target) - 1;
        if(f>=nums.length||nums[f]!=target) {
            return new int[]{-1, -1};
        }
        return new int[]{f,l};
    }    
}

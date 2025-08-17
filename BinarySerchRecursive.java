public class BinarySerchRecursive {

     public static int fun(int ar[],int l,int h,int t)
    {
        int m=l+(h-l)/2;
        if(l>h)
        return -1;
        if(ar[m]==t)return m;
        else if(ar[m]<t) return fun(ar,m+1,h,t);
        else return fun(ar,l,m-1,t);
       
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        return fun(nums,l,h,target);

    }

}
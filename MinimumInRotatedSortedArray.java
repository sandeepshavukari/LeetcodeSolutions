public class MinimumInRotatedSortedArray {
    public int findMin(int[] ar) {
        // Using Liner Serch 
        int m=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<=m)
            m=ar[i];
        }
        return m;

        //Using Binary Serch
        int min=Integer.MAX_VALUE;
        int l=0;
        int h=ar.length-1;
        while(l<=h)
        {
            int m=(l+h)/2;
            if(ar[m]<=ar[h])
            {
                min= Math.min(min,ar[m]);
                h=m-1;
            }
            else
            {
                min=Math.min(ar[m],min);
                l=m+1;
            }
        }
        return min;
    }

}

public class SortColoursOptimal {
     public void sortColors(int[] ar) {
        int l=0,m=0,h=ar.length-1;
        while(m<=h)
        {
            if(ar[m]==0)
            {
                int t=ar[l];
                ar[l]=ar[m];
                ar[m]=t;
                m++;
                l++;
            }
            else if(ar[m]==1)
            {
                m++;
            }
            else
            {
                int t=ar[m];
                ar[m]=ar[h];
                ar[h]=t;
                h--;
            }
        }
       System.out.print("[");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]);
            if(i<ar.length-1)
            System.out.print(",");
        }
        System.out.print("]");
    }
}

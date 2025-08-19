public class SetColors {
    public void sortColors(int[] ar) {
        int zc=0,oc=0,tc=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==0)zc++;
            else if(ar[i]==1)oc++;
            else tc++;
        }
        int in=0;
        while(zc-->0)ar[in++]=0;
        while(oc-->0)ar[in++]=1;
        while(tc-->0)ar[in++]=2;
        System.out.print("[");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]);
            if(i<ar.length-1)
            System.out.print(",");
        }
        System.out.print("]");
    }
}
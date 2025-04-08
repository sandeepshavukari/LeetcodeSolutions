public class CountPrimes { 
    public int countPrimes(int n) {
        int c=0;
        int ar[]= new int[n];
        for(int i=2;i<n;i++)
        {
            ar[i]=1;
        }
        for(int i=2;i*i<n;i++)
        {
            if(ar[i]==1)
            {
                for(int j=i*i;j<n;j+=i)
                {
                    ar[j]=0;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(ar[i]==1)
            c++;
        }
        return c;
    }
}
public class FindMaxAverage {

    public double findMaxAverage(int[] ar, int k) {
        double sum=0;
       for(int i=0;i<k;i++)
       {
        sum+=ar[i];
       }
       double m=sum;
       for(int i=k;i<ar.length;i++)
       {
            sum=sum+ar[i]-ar[i-k];
            m=Math.max(m,sum);
       }
       return m/k;
    }
}
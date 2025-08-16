public class ReverseSubMatrix{
    public int[][] reverseSubmatrix(int[][] ar, int x, int y, int k) {
        int t=x;
        int b=x+k-1;
        while (t<b) {
            for (int i=0;i<k;i++) {
                int te=ar[t][y+i];
                ar[t][y+i]=ar[b][y+i];
                ar[b][y+i]=te;
            }
            t++;
            b--;
        }
        return ar;
    }
}
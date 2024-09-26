public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int m=n;
        int k=n;
        int c=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                if(i==j||i+j==n-1)
                {
                        c=c+mat[i][j];
                }
            }
        return c;

    }
}

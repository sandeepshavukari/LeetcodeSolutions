public class RotateImage {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                int t= matrix[i][j];
                matrix[i][j]=matrix[n-j-1][n-i-1];
                matrix[n-j-1][n-i-1]=t;
            }
        }
        for(int i=0;i<n/2;i++)
        {
            for(int j=0;j<n;j++)
            {
                int t=matrix[i][j];
                matrix[i][j]=matrix[n-i-1][j];
                matrix[n-i-1][j]=t;
            }
        }
        
    }
}
class Convert1DArrayInto2DArray{
    public int[][] construct2DArray(int[] original, int m, int n) {
        int k=0;
        int ar[][]= new int[m][n];
        if(original.length!=n*m)
        return new int[0][0];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar[i][j]=original[k];
                k++;
            }
        }
        return ar;
    }
}
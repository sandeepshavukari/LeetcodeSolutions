public class NoOfIslands{
    int row;
    int col;
    boolean visited[][];
    public int numIslands(char[][] grid) {
        // int row,col;
        int c=0;
        row=grid.length;
        col=grid[0].length;
        visited = new boolean[row][col];
        // char visited[][];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j] == '1' && (!visited[i][j]))
                {
                    dfs(grid,i,j);
                    c++;
                }
            }
        }
        return c;
    }
    void dfs(char grid[][],int i,int j)
    {
        visited[i][j]=true;
        if(i+1<row&&grid[i+1][j]=='1'&&(!visited[i+1][j]))
        {
            dfs(grid,i+1,j);
        }
        if(i-1>=0&& grid[i-1][j]=='1'&&(!visited[i-1][j]))
        {
            dfs(grid,i-1,j);
        }
        if(j+1<col&& grid[i][j+1]=='1'&&(!visited[i][j+1]))
        {
            dfs(grid,i,j+1);
        }
        if(j-1>0&& grid[i][j-1]=='1'&&(!visited[i][j-1]))
        {
            dfs(grid,i,j-1);
        }
    }
}

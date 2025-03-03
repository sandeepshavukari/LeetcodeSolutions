import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    public static int findncr(int n,int r)
    {
        int a=1;
        for(int i=0;i<r;i++)
        {
             a=a*(n-i);
             a=a/(i+1);
        }
        return a;
    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            // int r=i;
            int a=0;
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                row.add(findncr(i,j));
            }
            ans.add(row);
        }
        return ans;
    }
}
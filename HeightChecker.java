import java.util.Arrays;
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int ar[]= new int[heights.length];
        int c=0;
        for(int i=0;i<heights.length;i++)
        {
            ar[i]=heights[i];
        }
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++)
        {
           if (ar[i]!=heights[i])
           c++;
        }
        return c;
    }
}

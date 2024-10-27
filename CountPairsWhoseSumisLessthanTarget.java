import java.util.Collections;
import java.util.List;

public class CountPairsWhoseSumisLessthanTarget {
    public int countPairs(List<Integer> nums, int target) {
        int n= nums.size();
        Collections.sort(nums);
        // int a= 0;
        // int b=n-1;
        int c=0;
        for(int i=0;i<n;i++)
        {
            // if(nums.get(a)+nums.get(b)>target)
            // {
            //     b--;
            // }
            // if(nums.get(a)+nums.get(b)==target)
            // a++;
            // else
            // {
            //     a++;
            //     c++;
            // }
            for(int j=0;j<n;j++)
            {
                if(i!=j&&nums.get(i)+nums.get(j)<target)
            {
                // b--;
                c++;
            }
            // if(nums.get(i)+nums.get(j)==target)
            // a++;
            // else
            // {
            //     a++;
            //     c++;
            // }
            }

        }
        return c/2;
    }
}

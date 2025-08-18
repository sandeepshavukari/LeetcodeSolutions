import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SubsetSum{
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> allss=new ArrayList<>();
        Set<List<Integer>> set= new HashSet()<>();
        for(int i=0;i<(1<<nums.length);i++)
        {
            List<Integer> li = new ArrayList<>();
            for(int j=0;j<nums.length;j++)
            {
                if((i&(1<<j))>0)
                {
                    li.add(nums[j]);
                }
            }
            if(set.add(li)){
                allss.add(li);
            }
        }
        return allss;
    }
}
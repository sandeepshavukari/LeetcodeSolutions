import java.util.*;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s= new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        } 
        if(s.size()<nums.length)
        return true;
        return false;
    }
}

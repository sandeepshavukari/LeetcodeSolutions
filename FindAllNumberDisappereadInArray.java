import java.util.*;
class FindAllNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int in= Math.abs(nums[i]);
            if(nums[in-1]>0)
            nums[in-1]*=-1;
        }
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                ans.add(i+1);
            }
        }
        return ans;
    }
}

/* Approach
Tḥe thing is that we have to take the advantage of the given array 
Asked to find the missing number so that the length is clear to us
So we have to find the we have to change the sign as per the index
if we do that if one valu is already negetive we dont have to change 
  the sign then that is th way the array iteration is completed then 
  we came to know which are repeated if at a point of index the value
  is +ve that is the place the number is missing so this is what the
  way we can solve that
# Complexity
- Time complexity:
O(n)

- Space complexity:
O(1)
*/


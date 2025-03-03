import java.util.*;

class Permutations {
    static void swap(int []ar,int i,int fi)
    {
        int t= ar[i];
        ar[i]=ar[fi];
        ar[fi]=t;
    }
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> result = new ArrayList<>();
        Permitate(nums, 0, result);
        return result;
    }
    public void Permitate(int nums[],int fi, List<List<Integer>> result)
    {
        List<Integer> ar= new ArrayList<>();
        if (fi == nums.length) 
        {
            List<Integer> perm = new ArrayList<>();
            for (int i=0;i<nums.length;i++) 
            {
                perm.add(nums[i]);
            }
            result.add(perm);
            return;
        }

        // int fi=0;
        for(int i=fi;i<nums.length;i++)
        {
            Permutations.swap(nums,i,fi);
            Permitate(nums,fi+1,result);
            Permutations.swap(nums,i,fi);
        }
    }
}
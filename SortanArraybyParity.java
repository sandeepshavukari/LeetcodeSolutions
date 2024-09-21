public class SortanArraybyParity  { 
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length; 
        int k=0; 
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                int t=nums[i];
                nums[i]=nums[k];
                nums[k]=t;
                k++;
            } 
        }
        return nums;
}
}

public class HowManyNumbersAreGraterThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int k,n=nums.length;
        int ar[]= new int[n];
        for(int i=0;i<n;i++)
        {
            k=0;
            for(int j=0;j<n;j++)
            {
                if(nums[i]>nums[j])
                {
                    k++;
                }
            }
            ar[i]=k;
        }
        return ar;
    }
}

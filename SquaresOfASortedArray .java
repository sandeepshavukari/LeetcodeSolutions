public class SquaresOfASortedArray  {
    //Solution with Time Complexity of  O(n log n)
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
     //Solution with Time Complexity of  O(n^2)
    public int[] sortedSquares1(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        for(int i=0;i<n;i++)
        {
           for(int j=i+1;j<n;j++)
           {
                if(nums[j]<nums[i])
                { 
                    nums[i]=nums[i]^nums[j];
                    nums[j]=nums[i]^nums[j];
                    nums[i]=nums[i]^nums[j];
                }
           }
        }
        return nums;
    }
}

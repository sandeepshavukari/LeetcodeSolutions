public class TwoSum-ii {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int a=0;
        int b=n-1;
        for(int i=0;i<n;i++)
        {
            if(numbers[a]+numbers[b]==target)
            break;
            else if(numbers[a]+numbers[b]<target)
            {
                a++;
            }
            else
            b--;
        }
        int ar[]= new int[2];
        ar[0]=a+1;
        ar[1]=b+1;
        return ar;
    }
}

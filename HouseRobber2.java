import java.util.Arrays;

public class HouseRobber2 {
    public static int robans(int n,int ar[],int dp[])
    {
        if(n==0) return dp[n]=ar[n];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        int p=ar[n]+robans(n-2,ar,dp);
        int np=0+robans(n-1,ar,dp);
        return dp[n]=Math.max(p,np);
    }
    public int rob(int[] nums) {
        int n= nums.length-1;
        if(n==0)
        return nums[0];
        int dp1[]= new int [n];
        Arrays.fill(dp1,-1);
        int dp2[]= new int [n];
        Arrays.fill(dp2,-1);
        int ar1[]=  Arrays.copyOfRange(nums,1,n+1);
        int ar2[]=  Arrays.copyOfRange(nums`,0,n);
        return Math.max(HouseRobber2.robans(n-1,ar1,dp1),HouseRobber2.robans(n-1,ar2,dp2));
    }
}

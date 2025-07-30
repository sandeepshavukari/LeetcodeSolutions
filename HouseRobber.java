public class HouseRobber {
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
       int dp[]= new int [n+1];
       Arrays.fill(dp,-1);
       return HouseRobber.robans(n,nums,dp);
    }
}

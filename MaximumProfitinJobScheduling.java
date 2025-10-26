import java.util.Arrays;

public class MaximumProfitinJobScheduling{
    int fun(int i , int[][] time, int n){
        if(i == n){
            return 0;
        }
        int nt = fun(i + 1,time,n);
        int t = (int)-1e8;
        int next = bin(time , time[i][1]); 
        t = time[i][2] + (next == -1 ? 0 : fun(next , time,n));
        return Math.max(nt , t);
    }
    int bin(int[][] time , int k){
        int n = time.length;
        int s = 0;
        int e = n - 1;
        while(s <= e){
            int m = s + (e - s)/2;
            int num = time[m][0];  
            if(num >= k){
                e = m-1;
            }else{
                s = m + 1;
            }
        }
        return s == n ? -1 : s;
    }
    
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] time = new int[n][3];
        for(int i = 0 ; i< n ; i++){
            time[i][0] = startTime[i];
            time[i][1] = endTime[i];
            time[i][2] = profit[i];
        }
        Arrays.sort(time , (x , y) -> {
            if(x[0] != y[0]){
                return Integer.compare(x[0],y[0]);
            }else{
                return Integer.compare(x[1],y[1]);
            }
        });
        int[] dp = new int[n + 1];
        for(int i = n-1; i >= 0; i--){
            int nt = dp[i + 1];
            int t = (int)-1e8;
            int next = bin(time , time[i][1]);
            t = time[i][2] + (next == -1 ? 0 : dp[next]);
            dp[i] = Math.max(nt , t);
        }   
        return dp[0];
    }
}
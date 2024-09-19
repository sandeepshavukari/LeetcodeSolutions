class MinimumCostClimbingStairs{
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        for(int i=0;i<n;i++)
        {
            if(i==0||i==1)
            continue;
            cost[i]=cost[i]+Math.min(cost[i-1],cost[i-2]);
        }
        return Math.min(cost[n-1],cost[n-2]);
    }
}

/*Approach
Firstly the thing is that we have to check the minimum cost to get out as we can climb one or two steps thats why we have to check form which place we have less cost from the previous or previous to the previous step after checking the cost odf every stage we have to check the final step as we go to final step we can jump from last step or last but one step there also we have to check the minimum

Complexity
Time complexity:
O(n)
Space complexity:
O(1)
*/
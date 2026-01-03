class NoWaysToPaintNx3Grid {
    public int numOfWays(int n) {
        int MOD = 1000000007;
        long x = 6, y = 6;
        for (int i = 2; i <= n; i++) {
            long newX = 3 * x + 2 * y;
            long newY = 2 * (x + y);
            x = newX % MOD;
            y = newY % MOD;
        }
        return (int)((x + y) % MOD);
    }
}

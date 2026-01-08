class MaxDotProductofTwoSubsequences {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int x = nums1.length;
        int y = nums2.length;

        int[][] table = new int[x + 1][y + 1];
        Arrays.stream(table).forEach(row -> Arrays.fill(row, Integer.MIN_VALUE));

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                table[i + 1][j + 1] = Math.max(
                        Math.max(table[i][j + 1], table[i + 1][j]),
                        Math.max(0, table[i][j]) + nums1[i] * nums2[j]
                );
            }
        }
        return table[x][y];
    }
}

package dp;

public class minPathsum {
    public int getMinPathSum(int[][] grid){
        int rowlen = grid.length;
        int collen = grid[0].length;
        int[][] dp = new int[rowlen][collen];

        //首先求出第一行的路径
        for (int i = 1; i < collen; i++){
            dp[0][i] = dp[0][i-1] + dp[0][i];
        }
        //求出第一列的路径值
        for (int j = 1; j < rowlen;j++){
            dp[j][0] = dp[j-1][0] + dp[j][0];
        }

        //依次计算每个位置的路径值
        for (int i=1; i < rowlen; i++){
            for (int j = 1;j< collen;j++){
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }

        return dp[rowlen-1][collen-1];

    }
}

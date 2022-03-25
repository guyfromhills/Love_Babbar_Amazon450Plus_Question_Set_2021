public class SpecificPair_07 {

    public static int pair(int[][] matrix) {

        // brute solution
//        int N = matrix.length;
//        int maxDifference = Integer.MAX_VALUE;
//        for (int a = 0; a < N; a++) {
//            for (int b = 0; b < N; b++) {
//                for (int c = a + 1; c < N; c++) {
//                    for (int d = b + 1; d < N; d++) {
//                        maxDifference = Math.max(maxDifference, matrix[c][d] - matrix[a][b]);
//                    }
//
//                }
//            }
//        }
//
//        return maxDifference;

        // quadratic solution
        int N = matrix.length;

        // another matrix
        int[][] dp = new int[N][N];

        int maxValue = Integer.MIN_VALUE;

        dp[0][0] = matrix[0][0];  ///initialize

        // make dp row with min element
        for (int i = 1; i < N; i++) {
            dp[0][i] = Math.min(matrix[0][i], dp[0][i - 1]);
        }


        // make dp column with min element
        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.min(matrix[i][0], dp[i - 1][0]);
        }

        // fill up dp starting from 1,1 ( with min elements) and update max Value
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                maxValue = Math.max(maxValue, matrix[i][j] - dp[i - 1][j - 1]);
                dp[i][j] = Math.min(matrix[i][j], Math.min(dp[i - 1][j], dp[i][j - 1]));
            }
        }

        return maxValue;

    }
}

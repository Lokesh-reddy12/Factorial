public class Main{
    public static int maxCommonStr(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int result = 0;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    result = Math.max(result, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String s1 = "abcdxyz";
        String s2 = "xyzabcd";
        System.out.println("Length of Longest Common Substring: " + maxCommonStr(s1, s2));
    }
}
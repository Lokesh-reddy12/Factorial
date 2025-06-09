class Main {
    public int findJudge(int n, int[][] trust) {
        int[] Trusted = new int[n+1];  // Array to track net trust score

        for (int[] person : trust) {
            Trusted[person[0]]--;  // person[0] trusts someone → decrease trust score
            Trusted[person[1]]++;  // person[1] is trusted → increase trust score
        }

        for (int i = 1; i <= n; i++) {
            if (Trusted[i] == n - 1) return i;  // Judge must be trusted by n-1, trust no one
        }

        return -1;  // No judge found
    }

    public static void main(String[] args) {
        Main obj = new Main();

        int[][] trust1 = {{1, 3}, {2, 3}};
        int[][] trust2 = {{1, 3}, {2, 3}, {3, 1}};
        int[][] trust3 = {};

        System.out.println(obj.findJudge(3, trust1)); // Expected: 3
        System.out.println(obj.findJudge(3, trust2)); // Expected: -1
        System.out.println(obj.findJudge(1, trust3)); // Expected: 1
    }
}

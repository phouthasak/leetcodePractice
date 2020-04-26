public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) return 1;

        int[] memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 2;

        for (int i = 3; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }

        return memo[n];
//        space = O(n)
//        time = O(n)
    }
}

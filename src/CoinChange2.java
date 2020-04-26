public class CoinChange2 {
    public int change(int amount, int[] coins) {
        // the index represent the current amount trying to solve for
        // value at index represents the known to number of ways for a particular amount
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            // use all the same coin repeatedly to calculate for all the amount before moving on to next coin
            for (int i = coin; i <= amount; i++) {
                // the current amount of ways is the:
                // known current amount of ways at particular amount (which is i) + the known current amount of ways at the remaining amount (which is i - coin)
                dp[i] += dp[i - coin];
            }
        }

        return dp[amount];
    }
}

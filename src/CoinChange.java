import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {

        // index represent the smalled amount of coins it takes to make that amount
        int[] dp = new int[coins.length + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = 0; i <= amount; i++) {
                // i represent the amount left to calculate for
                // dont consider coin amount that are greater than the target amount
                // because that would put us over the target amount
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
//  time = O(n^2)
//  space = O(n)
    }
}

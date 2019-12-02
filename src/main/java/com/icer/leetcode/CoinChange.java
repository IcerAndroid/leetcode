package com.icer.leetcode;

/**
 * 找零钱
 */
public class CoinChange {

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (coin <= i && dp[i - coin] != -1) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
                dp[i] = dp[i] == Integer.MAX_VALUE ? -1 : dp[i];
            }
        }
        return dp[amount] >= 0 ? dp[amount] : -1;
    }
}

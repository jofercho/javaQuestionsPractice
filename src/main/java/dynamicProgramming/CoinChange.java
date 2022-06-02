package dynamicProgramming;

public class CoinChange {
  public int coinChange(int[] coins, int amount) {
    if (amount < 1) return 0;
    int[] dp = new int[amount + 1];
    dp[0] = 0;
    for (int a = 1; a <= amount; a++) {
      int min = -1;
      for (int coin : coins) {
        if (coin == a) {
          min = 1;
          break;
        }
        if (a - coin < 0) {
          continue;
        }
        if (dp[a - coin] == -1) {
          continue;
        }
        int tmp = 1 + dp[a - coin];
        if (min < 0 || tmp < min) {
          min = tmp;
        }
      }
      dp[a] = min;
    }
    return dp[amount];
  }
}

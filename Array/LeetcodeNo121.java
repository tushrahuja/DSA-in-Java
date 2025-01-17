public class LeetcodeNo121 {
  public static void main(String[] args) {
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    System.out.println(maxProfit(prices));
  }

  static int maxProfit(int[] prices) {
    int min = Integer.MAX_VALUE;
    int max = 0;
    for (int i = 0; i < prices.length; i++) {
      min = Math.min(min, prices[i]);
      max = Math.max(max, prices[i] - min);
    }

    return max;
  }
}
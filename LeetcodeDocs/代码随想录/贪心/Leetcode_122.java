package 代码随想录.贪心;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/02/22:03
 * @since: 1.8
 */
public class Leetcode_122 {
    public int maxProfit(int[] prices) {
        int result = 0;
        //局部最优：收集每天的正利润，全局最优：求得最大利润。
        for (int i = 1; i < prices.length; i++) {
            result += Math.max(prices[i] - prices[i - 1], 0);
        }
        return result;
    }
}

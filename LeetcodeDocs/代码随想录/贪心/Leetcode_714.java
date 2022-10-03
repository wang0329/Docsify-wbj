package 代码随想录.贪心;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/03/19:29
 * @since: 1.8
 */
public class Leetcode_714 {
    public int maxProfit(int[] prices, int fee) {
        int buy = prices[0] + fee;
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            //寻找更小的买入值
            if(prices[i] + fee < buy){
                buy = prices[i] + fee;
            }else if(prices[i] > buy){
                //累加利润
                sum += prices[i] - buy;
                //更新买入值
                buy = prices[i];
            }
        }
        return sum;
    }
}

package 代码随想录.贪心;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/03/17:23
 * @since: 1.8
 * 柠檬水找零
 */
public class Leetcode_860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        //情况一：账单是5，直接收下。
        //情况二：账单是10，消耗一个5，增加一个10
        //情况三：账单是20，优先消耗一个10和一个5，如果不够，再消耗三个5
        for (int i = 0; i < bills.length; i++) {
            if(bills[i] == 5){
                five++;
            }else if (bills[i] == 10){
                ten++;
                five--;
            }else if(bills[i] == 20){
                if(ten > 0){
                    ten--;
                    five--;
                }else {
                    five-=3;
                }
            }
            if(five < 0 || ten < 0)return false;
        }
        return true;
    }
}

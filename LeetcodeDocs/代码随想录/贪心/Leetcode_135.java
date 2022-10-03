package 代码随想录.贪心;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/02/20:52
 * @since: 1.8
 * 分发糖果
 */
public class Leetcode_135 {
    //局部最优推出全局最优
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] arr = new int[n];
        arr[0] = 1;
        //从左往右遍历  局部最优
        //起点下标1 从左往右，只要 右边 比 左边 大，右边的糖果=左边 + 1
        for(int i = 1;i < n;i++){
            if(ratings[i] > ratings[i - 1]){
                arr[i] = arr[i-1] + 1;
            }else {
                arr[i] = 1;
            }
        }
        // 2、起点下标 ratings.length - 2 从右往左，
        // 只要左边 比 右边 大，此时 左边的糖果应该 取本身的糖果数（符合比它左边大） 和 右边糖果数 + 1 二者的最大值
        // 这样才符合 它比它左边的大，也比它右边大
        for(int i = n-1;i >= 0; i--){
            if(ratings[i] > ratings[i+1]){
                arr[i] = Math.max(arr[i],arr[i+1]+1);
            }
        }
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum +=arr[i];
        }
        return sum;
    }
}

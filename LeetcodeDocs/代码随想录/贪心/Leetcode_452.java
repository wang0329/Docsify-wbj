package 代码随想录.贪心;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/03/17:45
 * @since: 1.8
 * 用最少数量的箭引爆气球
 */
public class Leetcode_452 {
    public int findMinArrowShots(int[][] points) {
        //按起始位置排序
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int count = 1;
        for (int i = 1; i < points.length; i++) {
            //如果当前起始值 大于 上一个终点  count++
            if(points[i][0] > points[i-1][1]){
                count++;
            }else {
                //如果小于  则进行重叠
                points[i][1] = Math.min(points[i][1],points[i-1][1]);
            }
        }
        return count;
    }
}

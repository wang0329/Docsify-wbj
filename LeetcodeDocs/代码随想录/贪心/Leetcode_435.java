package 代码随想录.贪心;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/03/18:36
 * @since: 1.8
 */
public class Leetcode_435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        //按照右边界升序处理
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int count = 0;
        int pre = Integer.MIN_VALUE;
        for (int i = 0; i < intervals.length; i++) {
            // 若上一个区间的右边界小于当前区间的左边界，说明无交集
            if(intervals[i][0] >= pre){
                pre = intervals[i][1];
            }else {
                count++;
            }
        }
        return count;
    }
}

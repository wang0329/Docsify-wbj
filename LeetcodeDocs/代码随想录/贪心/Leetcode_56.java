package 代码随想录.贪心;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/03/18:57
 * @since: 1.8
 * 合并区间
 */
public class Leetcode_56 {
    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> res = new LinkedList<>();
        //按照起始边界排序
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            //如果当前起始值小于上一个最终值
            if(intervals[i][0] <= res.getLast()[1]){
                //合并区间
                int start = res.getLast()[0];
                int end = Math.max(intervals[i][1],res.getLast()[1]);
                res.removeLast();
                res.add(new int[]{start,end});
            }else {
                //直接加入结果集
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}

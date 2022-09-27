package 算法基础.排序;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/09/27/20:56
 * @since: 1.8
 * 506 相对名次
 */
public class leetcode_506 {
    String[] str = new String[]{"Gold Medal","Silver Medal","Bronze Medal"};
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        int[] clone = score.clone();
        Arrays.sort(clone);
        //哈希表
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = n-1;i >=0;i++){
            map.put(clone[i],n-1-i);
        }
        for(int i = 0;i<n;i++){
            int rank = map.get(score[i]);
            ans[i] = rank < 3 ?str[rank] : String.valueOf(rank+1);
        }
        return ans;
    }
}

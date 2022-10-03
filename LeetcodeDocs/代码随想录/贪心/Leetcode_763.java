package 代码随想录.贪心;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/03/18:48
 * @since: 1.8
 * 划分字母区间
 */
public class Leetcode_763 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        char[] c = s.toCharArray();
        int[] arr = new int[26];
        //统计每一个字符最后出现的位置
        for (int i = 0; i < c.length; i++) {
            arr[c[i] - 'a'] = i;
        }

        int index = 0;
        int last = -1;
        //从头遍历字符，并更新字符的最远出现下标，如果找到字符最远出现位置下标和当前下标相等了，则找到了分割点
        for (int i = 0; i < c.length; i++) {
            index = Math.max(index,arr[c[i] - 'a']);
            if(i == index){
                list.add(i - last);
                last = i;
            }
        }
        return list;
    }
}

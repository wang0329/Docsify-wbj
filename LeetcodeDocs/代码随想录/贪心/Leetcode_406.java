package 代码随想录.贪心;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/03/17:30
 * @since: 1.8
 * 根据身高重建队列
 */
public class Leetcode_406 {
    public int[][] reconstructQueue(int[][] people) {
        //局部最优：优先按身高高的people的k来插入。插入操作过后的people满足队列属性
        //全局最优：最后都做完插入操作，整个队列满足题目队列属性
        Arrays.sort(people,(a,b) -> {
            if(a[0] == b[0]) return a[1] -b[1];
            return b[0] - a[0];
        });

        LinkedList<int[]> arr = new LinkedList<>();
        for(int[] i : people){
            arr.add(i[1],i);
        }
        return arr.toArray(new int[people.length][]);
    }
}

package 数据结构.字符串哈希;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/09/27/12:57
 * @since: 1.8
 */
public class StringHash {

    //DNA序列
    class Solution {
        //由题目得长度为10
        static final int  L = 10;
        public List<String> findRepeatedDnaSequences(String s) {
            //返回值
            List<String> list = new ArrayList<>();
            //Map容器
            Map<String,Integer> map = new HashMap<>();
            int n = s.length();
            //从0 - n-L遍历
            for(int i = 0;i <= n - L;i++){
                //分割
                String str = s.substring(i,i+L);
                //放入Map容器
                map.put(str,map.getOrDefault(str,0)+1);
                //判断是否符合所求
                if(map.get(str) == 2){
                    list.add(str);
                }
            }
            return list;
        }
    }

}

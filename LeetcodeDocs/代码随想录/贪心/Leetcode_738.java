package 代码随想录.贪心;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/03/19:18
 * @since: 1.8
 * 单调递增的数字
 */
public class Leetcode_738 {
    public int monotoneIncreasingDigits(int n) {
        String s = String.valueOf(n);
        char[] c = s.toCharArray();
        int start = s.length();
        //从右向左遍历如果当前位大于下一位
        //则当前位减一  后边位数变为9
        for (int i = c.length - 2; i >= 0; i--) {
            if(c[i] > c[i+1]){
                c[i]--;
                start = i+1;
            }
        }
        // 后边位数变为9
        for(int i = start;i<c.length;i++){
            c[i] = '9';
        }
        return Integer.parseInt(String.valueOf(c));
    }
}

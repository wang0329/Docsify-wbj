package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/04/17:47
 * @since: 1.8
 */
public class Leetcode_93 {
    List<String> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) return res;
        dfs(s, 0, 0);
        return res;
    }

    private void dfs(String s, int index, int parIndex) {
        if (parIndex == 3) {
            if (isVaild(s, index, s.length() - 1)) {
                res.add(s);
            }
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isVaild(s, index, i)) {
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                parIndex++;
                System.out.println(i + ">>>>>进入》》》》》分区数量"+ parIndex +">>>>>>"+s);

                dfs(s, i + 2, parIndex);



                parIndex--;// 回溯
                s = s.substring(0, i + 1) + s.substring(i + 2);
                System.out.println(i + ">>>>>删除后》》》》》分区数量"+ parIndex +">>>>>>"+s);
            } else {
                break;
            }
        }


    }

    private boolean isVaild(String s, int start, int end) {
        if (start > end) {
            return false;
        }
        if (s.charAt(start) == '0' && start != end) { // 0开头的数字不合法
            return false;
        }
        int num = 0;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') { // 遇到⾮数字字符不合法
                return false;
            }
            num = num * 10 + (s.charAt(i) - '0');
            if (num > 255) { // 如果⼤于255了不合法
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Leetcode_93 leetcode93 = new Leetcode_93();
        String s = "25525511135";
        List<String> ans = leetcode93.restoreIpAddresses(s);
        System.out.println(ans.toString());

    }
}

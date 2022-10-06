package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/04/16:08
 * @since: 1.8
 */
public class Leetcode_17 {
    List<String> res = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0){
            return res;
        }
        dfs(digits,0);
        return res;
    }

    private void dfs(String digits, int index) {
        if(index == digits.length()){
            res.add(sb.toString());
            return;
        }
        String str = numString[digits.charAt(index) - '0'];
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            dfs(digits,index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

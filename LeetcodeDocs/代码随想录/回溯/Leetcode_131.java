package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/04/17:26
 * @since: 1.8
 */
public class Leetcode_131 {
    List<List<String>> res = new ArrayList<>();
    LinkedList<String> path = new LinkedList<>();
    public List<List<String>> partition(String s) {

        dfs(s,0);
        return res;
    }
    private void dfs(String s, int index) {
        if(index >= s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < s.length() ; i++) {
            if(ishuiwen(s,index,i)){
                String str = s.substring(index,i+1);
                path.add(str);
            }else {
                continue;
            }
            dfs(s,i+1);
            path.removeLast();

        }
    }
    private boolean ishuiwen(String s, int index, int end) {
        for(int i =index,j = end;i<j;i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}

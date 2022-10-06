package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/04/11:45
 * @since: 1.8
 * 组合
 */
public class Leetcode_77 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(n,k,1);
        return res;
    }

    private void dfs(int n,int k,int index){
        if(path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = index ;i <= n - (k - path.size()) + 1; i++){
            path.add(i);
            dfs(n,k,i+1);
            path.removeLast();
        }
    }
}

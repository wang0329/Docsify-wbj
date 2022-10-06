package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/04/15:41
 * @since: 1.8
 */
public class Leetcode_216 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(k,n,1,0);
        return res;
    }

    private void dfs(int k, int n, int index,int sum) {
        if(sum > n){
            return;
        }
        if(path.size() > k){
            return;
        }
        if(sum == n && path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i <= 9; i++) {
            path.add(i);
            sum += i;
            dfs(k,n,i+1,sum);
            sum -= i;
            path.removeLast();

        }
    }
}

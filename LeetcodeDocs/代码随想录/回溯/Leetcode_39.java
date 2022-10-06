package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/04/16:25
 * @since: 1.8
 */
public class Leetcode_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int len = candidates.length;
        if(len == 0)return res;
        Arrays.sort(candidates);
        LinkedList<Integer> path = new LinkedList<>();
        dfs(res,path,candidates,target,0,0);
        return res;
    }

    private void dfs(List<List<Integer>> res,LinkedList<Integer> path ,
                     int[] candidates, int target, int index, int sum) {
        if(sum == target){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = index;i < candidates.length;i++){
            if(sum + candidates[i] > target) return;
            path.add(candidates[i]);
            dfs(res,path,candidates,target,i,sum + candidates[i]);
            path.removeLast();
        }
    }
}

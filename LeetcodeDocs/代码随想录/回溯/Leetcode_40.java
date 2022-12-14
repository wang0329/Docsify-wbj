package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/04/17:05
 * @since: 1.8
 */
public class Leetcode_40 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int len = candidates.length;
        if(len == 0)return res;
        Arrays.sort(candidates);
        dfs(candidates,target,0);
        return res;

    }
    private void dfs(int[] candidates, int target, int index) {
        if(sum == target){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < candidates.length && sum + candidates[i] <= target; i++) {
            if ( i > index && candidates[i] == candidates[i - 1] ) {
                continue;
            }
            sum+=candidates[i];
            path.add(candidates[i]);
            System.out.println("进入dfs———————————————————" + Arrays.toString(path.toArray()) + "=======" + sum);
            dfs(candidates,target,i+1);
            int temp = path.getLast();
            sum -= temp;
            path.removeLast();
            System.out.println("出来dfs———————————————————" + Arrays.toString(path.toArray()) + "=======" + sum);

        }
    }

    public static void main(String[] args) {
        Leetcode_40 leet40 = new Leetcode_40();
        int[] candidates = new int[]{10,1,2,7,6,1,5}; int target = 8;
        List<List<Integer>> ans = leet40.combinationSum2(candidates,target);
        System.out.println(ans.toString());
    }
}

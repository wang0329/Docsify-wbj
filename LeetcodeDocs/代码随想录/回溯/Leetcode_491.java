package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/05/11:38
 * @since: 1.8
 */
public class Leetcode_491 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList();

    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(nums, 0);
        return res;
    }

    private void dfs(int[] nums, int index) {
        if (path.size() > 1) {
            res.add(new ArrayList<>(path));
        }
        int[] flag = new int[201];
        for (int i = index; i < nums.length; i++) {
            if (!path.isEmpty() && nums[i] < path.get(path.size() - 1) ||
                    (flag[nums[i] + 100] == 1)) {
                continue;
            }
            flag[nums[i] + 100] = 1;
            path.add(nums[i]);
            dfs(nums, i + 1);
            path.removeLast();
        }
    }
}

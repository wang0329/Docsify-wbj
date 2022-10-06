package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/05/12:01
 * @since: 1.8
 */
public class Leetcode_47 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    int[] flag = new int[21];

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        dfs(nums, flag);
        return res;
    }

    private void dfs(int[] nums, int[] flag) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && flag[i + 9] == 0) {
                continue;
            }
            if (flag[i + 10] == 0) {
                flag[i + 10] = 1;
                path.add(nums[i]);
                dfs(nums, flag);
                path.removeLast();
                flag[i + 10] = 0;
            }
        }
    }
}

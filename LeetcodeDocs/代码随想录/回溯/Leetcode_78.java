package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/04/18:22
 * @since: 1.8
 */
public class Leetcode_78 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path =  new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        dfs(nums,0);
        return res;
    }

    private void dfs(int[] nums, int index) {
         res.add(new ArrayList<>(path));
         if(index >= nums.length) return;
        for (int i = index; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums,i+1);
            path.removeLast();
        }
    }
}

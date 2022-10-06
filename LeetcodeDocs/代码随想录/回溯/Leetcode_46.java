package 代码随想录.回溯;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/05/11:55
 * @since: 1.8
 */
public class Leetcode_46 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0){
            return res;
        }
        dfs(nums,path);
        return res;
    }

    private void dfs(int[] nums, LinkedList<Integer> path) {
        if(path.size() == nums.length){
            res.add(new ArrayList<>(path));
        }
        for (int i = 0; i < nums.length; i++) {
            if(path.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            dfs(nums,path);
            path.removeLast();
        }
    }
}

package 算法基础.排序;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/09/27/20:34
 * @since: 1.8
 * 448 找到所有数组中消失的数字
 */
public class leetcode_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        //桶排序
        for(int i = 0;i < n;i++){
            while(nums[i] != i+1 && nums[nums[i] - 1] != nums[i]){
                swap(nums,i,nums[i]-1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i < n;i++){
            if(nums[i] != i + 1) ans.add(i + 1);
        }
        return ans;
    }

    void swap(int[] nums, int i, int j) {
        int c = nums[i];
        nums[i] = nums[j];
        nums[j] = c;
    }
}

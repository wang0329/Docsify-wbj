package 代码随想录.贪心;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/02/22:19
 * @since: 1.8
 */
public class Leetcode_1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
//        第一步：将数组按照绝对值大小从大到小排序，注意要按照绝对值的大小
//        第二步：从前向后遍历，遇到负数将其变为正数，同时K--
//        第三步：如果K还大于0，那么反复转变数值最小的元素，将K用完
//        第四步：求和
        if (nums.length == 1) return k % 2 == 0 ? nums[0] : -nums[0];
        Arrays.sort(nums);
        int sum = 0;
        int idx = 0;
        for (int i = 0; i < k; i++) {
            if (i < nums.length - 1 && nums[idx] < 0) {
                nums[idx] = -nums[idx];
                if (nums[idx] >= Math.abs(nums[idx + 1])) idx++;
                continue;
            }
            nums[idx] = -nums[idx];
        }

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}

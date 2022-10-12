package 代码随想录.数组;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/11/9:18
 * @since: 1.8
 */
public class Leetcode_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        for(int right = 0;right < nums.length;right++){
            sum += nums[right];
            while(sum > target){
                res = Math.min(res,right - left + 1);
                sum -= nums[left++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}

package 代码随想录.数组;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/11/8:56
 * @since: 1.8
 */
public class Leetcode_977 {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int[] res = new int[nums.length];
        int j = nums.length - 1;
        while(l <= r){
            if(nums[l] * nums[l] < nums[r] * nums[r]){
                res[j--] = nums[r] * nums[r--];
            }else{
                res[j--] = nums[l] * nums[l++];
            }
        }
        return res;
    }
}

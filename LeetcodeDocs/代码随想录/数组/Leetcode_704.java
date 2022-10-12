package 代码随想录.数组;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/11/8:38
 * @since: 1.8
 */
public class Leetcode_704 {
    public int search(int[] nums, int target) {
        if(nums[0] > target || nums[nums.length-1] < target){
            return -1;
        }
        int left = 0,right = nums.length - 1;
        while (left <= right){
            int mid = left +((right-left)>>1);
            if(nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                left = mid +1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}

package 代码随想录.数组;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/11/8:52
 * @since: 1.8
 */
public class Leetcode_27 {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for(int fast = 0;fast < nums.length;fast++){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}

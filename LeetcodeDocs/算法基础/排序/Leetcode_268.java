package 算法基础.排序;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/09/27/19:32
 * @since: 1.8
 * 268 丢失的数字
 */
public class Leetcode_268 {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            //原地排序
            for(int i = 0;i < n;i++){
                if(nums[i] != i && nums[i] < n) swap(nums,nums[i],i--);
            }
            for(int i = 0;i < n;i++){
                if(nums[i] != i) return i;
            }
            return n;
        }
        void swap(int[] nums,int i,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}

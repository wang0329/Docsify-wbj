package 算法基础.排序;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/09/27/13:25
 * @since: 1.8
 */
public class Leetcode_41 {

    //41.缺失的整数
    public static int firstMissingPositive(int[] nums) {
        int len = nums.length;
        //遍历数组   如果不符合条件则交换
        for(int i = 0;i<len;i++){
            while(nums[i] >= 1 && nums[i] <= len && nums[i] != nums[nums[i] - 1] && nums[i]!= i +1){
                swap(nums,i,nums[i] - 1);
            }
        }
        for(int i = 0;i<len;i++){
            if(nums[i] != i + 1)return i + 1;
        }
        return len + 1;
    }
    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3,4,-1,1};
        firstMissingPositive(arr);
    }
}

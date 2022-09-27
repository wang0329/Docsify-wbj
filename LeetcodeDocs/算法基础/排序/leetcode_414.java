package 算法基础.排序;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/09/27/20:19
 * @since: 1.8
 * 414第三大的数
 */
public class leetcode_414 {
    //定义最小值
    long inf = (long) -1e18;
    public int thirdMax(int[] nums) {
        //记录三个最值
        long a = inf,b = inf,c = inf;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > a){
                c = b;b = a;a = nums[i];
            }else if(nums[i] < a && nums[i] > b){
                c = b;b = nums[i];
            }else if(nums[i] < b && nums[i] >c){
                c = nums[i];
            }
        }
        return c != inf ? (int)c : (int)a;
    }
}

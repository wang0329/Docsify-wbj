package 代码随想录.哈希表;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/10/13/17:23
 * @since: 1.8
 */
public class Leetcode_349 {
    public int[] intersection(int[] nums1, int[] nums2) {

        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> arr = new HashSet<>();
        Set<Integer> resarr = new HashSet<>();
        for (int i : nums1) {
            arr.add(i);
        }

        for (int i : nums2) {
            if (arr.contains(i)) {
                resarr.add(i);
            }
        }

        return resarr.stream().mapToInt(x -> x).toArray();
    }
}

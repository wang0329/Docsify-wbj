package 算法基础.二分;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: wbj
 * @date: 2022/09/28/14:53
 * @since: 1.8
 */
public class Leetcode_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        int idx = 0;
        for(int i : nums1)arr[idx++] = i;
        for(int i : nums2)arr[idx++] = i;
        Arrays.sort(arr);
        int l = arr[(n + m) / 2];
        int r = arr[(n + m - 1) / 2];
        return (l+r)/2.0;
    }
}

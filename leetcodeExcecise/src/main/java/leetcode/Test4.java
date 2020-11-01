package leetcode;

import java.util.Arrays;

public class Test4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length+nums2.length;
        int[] sum_nums = Arrays.copyOf(nums1,len);
        System.arraycopy(nums2,0,sum_nums,nums1.length,nums2.length);
        Arrays.sort(sum_nums);
        if(len%2==1){
            return sum_nums[len/2];
        }else {
            int num1 = sum_nums[len/2-1]+sum_nums[len/2];
            double result = num1/2.0;
            return result;
        }
    }

    public static void main(String[] args) {
        int[] l1 = {1,2};
        int[] l2 = {3,4};
        double medianSortedArrays = new Test4().findMedianSortedArrays(l1, l2);
        System.out.println(medianSortedArrays);
    }
}

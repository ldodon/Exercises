package com.endava.exercises.extra.secondTasks;

import java.util.Arrays;
import java.util.List;
//Write a Java program to switch with places columns of a matrix.
//ex.            to
//1 2 3 4     4 3 2 1
//1 2 3 4     4 3 2 1
//1 2 3 4     4 3 2 1

public class SecondMatrice {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 2, 3, 4};
        System.out.println("Original matrix: ");
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
        int[] result1 = new SecondMatrice().permute(nums1);
        int[] result2 = new SecondMatrice().permute(nums2);
        int[] result3 = new SecondMatrice().permute(nums3);
        System.out.println("Switched places columns of a matrix:");
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));

    }

    public int[] permute(int[] nums) {
        int[] m = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            m[nums.length - 1 - i] = nums[i];

        }
        return m;
    }

}
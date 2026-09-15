package main.java.javaBrushUp;

import java.util.Arrays;

public class movezerosinplace {
    static int[] arr = { 0, 0, 1, 2, 30, 2, 0, 1, 33, 88, 0, 231, 0 };

    public static void main(String[] args) {
        System.out.println(moveZeros(arr));
    }

    public static String moveZeros(int[] nums) {

        int insertIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertIndex] = nums[i];
                insertIndex++;

            }
        }

        while (insertIndex<nums.length) {
            nums[insertIndex]=0;
            insertIndex++;
        }

        return Arrays.toString(nums);
    }

}

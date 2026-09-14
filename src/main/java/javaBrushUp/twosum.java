package javaBrushUp;

import java.util.Arrays;

public class twosum {
    
public static void main(String[] args) {
    int[] test = {22, 903, 99, 11, 88, 77, 29};

    int num = 51;

    System.out.println(findNumbers(test, num));
}

public static String findNumbers(int[] nums, int target){

    int[] solution = new int[2];
    for(int i=0;i<nums.length;i++){

       for(int j=i+1;j<nums.length;j++){


        if (nums[i]+nums[j]==target) {
            solution[0]=i;
            solution[1]=j;
            return Arrays.toString(solution);
        }
       
       }
    }


return "no sum found";
}

}

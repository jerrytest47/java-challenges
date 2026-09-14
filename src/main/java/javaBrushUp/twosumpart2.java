package javaBrushUp;

import java.util.Arrays;
import java.util.HashMap;

public class twosumpart2 {

    public static void main(String[] args) {
        int[] test = { 22, 903, 99, 11, 88, 77, 29 };

        int num = 51;

        findIndices(test, num);
    }

    // using O(n) time to solve
    public static int[] findIndices(int[] input, int target) {

        HashMap<Integer, Integer> ints = new HashMap<>();
        int[] solution = new int[2];
        for (int i = 0; i < input.length; i++) {
            
            int needed = target - input[i];
            if (ints.containsKey(needed)) {
                solution[1] = ints.get(needed);
                solution[0] = i;                
                System.out.println(Arrays.toString(solution));
                return solution;
            }

          ints.put(input[i], i);

        }

        return null;
    }

}

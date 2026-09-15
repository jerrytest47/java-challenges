package main.java.javaBrushUp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class hashMapPractice {
	
	public static void main(String[] args) {

	
	System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));


}
	

//
//	int target = 9;
//	
//	static int[] twoSums(int num, int[] arr) {
//		
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int i=0; i<arr.length; i++) {
//			int need = num - arr[i];
//			if(map.containsValue(need)) {
//				return new int[]{map.get(need),i};
//			}
//			map.put(arr[i],i);
//		}
//		return new int[] {-1, -1};
//	}
	
	static int[] twoSum(int[] nums, int target) {
	    if (nums == null) return new int[]{-1, -1};

	    Map<Integer, Integer> seen = new HashMap<>(); // value -> index
	    for (int i = 0; i < nums.length; i++) {
	        int need = target - nums[i];
	        if (seen.containsKey(need)) {
	            return new int[]{seen.get(need), i};
	        }
	        seen.put(nums[i], i);
	    }
	    return new int[]{-1, -1};
	}

	
}
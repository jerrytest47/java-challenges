package main.java.javaBrushUp;

import java.util.ArrayList;

public class javaArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arrays -fixed size/can't be changed, faster access, lower memory overhead, can hold primitives int, double, string, etc or objects
		int[] arr = new int[5];// 5, 10

		arr[0] = 1;

		arr[1] = 2;

		arr[2]= 4;

		arr[3]= 5;

		arr[4]= 6;
		//arraylist dynamic size, slightly slower, more memory overhead, can only hold objects, part of java collections framework
		ArrayList a = new ArrayList<String>();
		a.add("jeremiah");
		a.add("sprague");
		a.remove(0);
		a.add("selenium");
		a.add("test");
		
		System.out.println(a.get(0));
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		//enhanced for loop
		for(Object val :a) {
			System.out.println(val);
		}
		
		System.out.println(a.contains("sprague"));
		
		
	}

}

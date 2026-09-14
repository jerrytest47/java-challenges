package javaBrushUp;

import java.lang.reflect.Method;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString1("helloworld"));
	
	}
	
	static String reverseString1(String s) {
		if(s==null) { return null;}
		char[] ar = s.toCharArray();
		int i = 0; int j = s.length()-1;	
		while (i<j) {
			char temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			i++; j--;
			
		}
		
		return new String(ar);
		
	}
	

}

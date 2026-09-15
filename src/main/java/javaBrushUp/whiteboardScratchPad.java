package main.java.javaBrushUp;

import java.util.Iterator;

public class whiteboardScratchPad {

	public static void main(String[] args) {

//these work		
//System.out.println(stringReverser("blah"));		
//System.out.println(palindromeCheck("qabcdcbaq"));
		
		
	}

	
	 static char[] stringReverser(String s) {	
		if(s==null) {
			return null;
		}
		
		char[] arr= s.toCharArray();
		char[] reversed = new char[s.length()];
		int j = 0;
		for(int i=s.length()-1; i>=0;i--) {
			
			char c = arr[i];
			
			reversed[j] = c;
			j++;
		}
		
		return reversed;	
	}
	
	 static String palindromeCheck(String p) {
		
		char[] palindrome = p.toCharArray();
		int o =0;
		int j = p.length()-1;
		while(o<=j) {
			if (palindrome[o]!=palindrome[j]) {
				return p+" is not a palindrome";
			}
			if (o==j) {
				return p+" is a palindrome";
			}
			j--;o++;
		}
		
		
		return "how did you even get here?";
	}
	 //find the first non-repeating character
	 static Character findNonRepeatingChar(String s) {
		 
		 
		 
		 return null;
	 }
	
	
	
}

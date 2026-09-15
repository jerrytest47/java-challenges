package main.java.javaBrushUp;

public class palindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("blargh"));

	}
	
	static String isPalindrome(String s) {
		
		if(s == null) return null;
		int i = 0; int j = s.length()-1;
		char[] arr = s.toCharArray();
		while(i<j) {
			if (arr[i]==arr[j]) {
				i++;j--;
			}
			if(arr[i]!=arr[j]) {
			return s+ " is not a palindrome";
		}
			
		}
		
		return s + " is a palindrome";
	}

}

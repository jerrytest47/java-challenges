package main.java.javaBrushUp;

import java.util.Iterator;

public class javaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public void stringMethods()
	{
		//string literal - String is an object that represents a number of characters
				String s = "Java is awesome";
				
				//new keyword can create mutliple objects with the same text
				String s1 = new String("Selenium");
				String s2 = new String("Selenium");
				
				//split will create 3 strings, thus an array because there are 2 spaces to split on
				String[] splitString = s.split(" ");
				
				System.out.println(splitString[0]);
				System.out.println(splitString[1]);
				System.out.println(splitString[2]);
				//can split on a space or word, character - 2 strings in array created as there is only one "is" to split on
				String k = "Java is so awesome";
				
				String[] splitString1 = k.split("is");
				
				System.out.println("**********");
				System.out.println(splitString1[0]);
				System.out.println(splitString1[1]);
				
				//get rid of white space at end of Java string with trim
				String t = "Java is so awesome";
				
				String[] splitString2 = t.split("is");
				//**Remember to reassign the result! Strings are immutable in Java - this means any operation that appears to modify a string actually creates a new string object instead 
				splitString2[0] = splitString2[0].trim();
				splitString2[1] = splitString2[1].trim();
				System.out.println("**********");
				System.out.println(splitString2[0]);
				System.out.println(splitString2[1]);
				//how to print characters in reverse *remember reverse loop is: int i=arr.length-1;i>=0;i-- in regular loop: int i=0; i<arr.length; i++;
				//reverse loop length gets a minus 1, and you iterate until is greater than or equal to 0
				for(int i =t.length()-1; i>=0;i--)
				{
					
					System.out.println(t.charAt(i));
				}
	}

}

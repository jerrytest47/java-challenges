package main.java.javaBrushUp;

public class fizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Prompt: Print 1..n:
//
//			multiples of 3 → Fizz
//
//			multiples of 5 → Buzz
//
//			multiples of both → FizzBuzz
		int[] arr = {25,17,15,3,9,10};
		findRemainders(arr);
		
	}
	
	static void findRemainders (int[] num) {
		for(int i =0;i<num.length;i++ )
		if (num[i]%15==0) {
			System.out.println("FizzBuzz");
		}
			else if (num[i]%3==0) {
				System.out.println("Fizz");
			}
			else if(num[i]%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(num);
			}
		}
	}



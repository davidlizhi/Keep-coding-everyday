package testCase;

import day1.ProductOfTwoNumber;

public class Test {

	
	public static void main(String[] args) {

		int a = 3;
		int b = 9;
		
		int c = ProductOfTwoNumber.product(a, b);
		
		System.out.println("the product of 3 and 9 is: " + c);
		System.out.println("The big O is: O(b)");
	}

}

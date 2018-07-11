package day1;

public class ProductOfTwoNumber {

	public static int product(int a, int b) {
		int sum = 0;
		
		for(int i = 0; i < b; i++) {
			sum += a;
		}		
		
		return sum;
	}
	
	
	public static void main(String[] args) {

		int a = 3;
		int b = 9;
		
		int c = product(a, b);
		
		System.out.println("the product of 3 and 9 is: " + c);
		System.out.println("The big O is: O(b)");
	}

}

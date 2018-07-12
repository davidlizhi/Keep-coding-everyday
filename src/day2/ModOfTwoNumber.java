package day2;

public class ModOfTwoNumber {

	public static int mod(int a, int b) {  // 5 % 2 = 1
		
		if (b <= 0) {
			return -1;
		}
		
		int div = a / b;	
		
		return a - div * b;
	}
	
	
	public static void main(String[] args) {
		
		int c = mod(5, 2);
		
		System.out.println("5 % 2 = " + c);
		System.out.println("Big O is : O(1)");

	}

}

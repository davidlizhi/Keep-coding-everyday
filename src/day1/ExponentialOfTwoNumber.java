package day1;

public class ExponentialOfTwoNumber {

	public static int power1(int a, int b) {
		
		if(b == 0) {
			return 1;
		}
		
		if(b == 1) {
			return a;
		}		
		
		int sum = 0;
		
		for (int j = 1; j <= b; j++) {
			
			if (j == 1) {
				sum = a;
			} else {		
				int m = sum;
				for(int i = 1; i < a; i++) {
					sum += m;
				}				
			}
			
		
		}		

		return sum;
		
	}
	
	public static int power2(int a, int b) {
		
		if (b < 0) {
			return 0; //error
		}
		if (b == 0) {
			return 1;
		}
		
		return ( a * power2(a, (b-1)) );
		
	}
	
	
	
	public static void main(String[] args) {
		
		int c = power1(2, 4);
		
		System.out.println("power of 2 to 4 is: " + c);
		System.out.println("The big O for power1 is: O(ab)");
		
		c = power2(2, 4);
		
		System.out.println("power of 2 to 4 is: " + c);
		System.out.println("The big O for power2 is: O(b). But use more stack space. ");
		
	}
	
	
//	The time complexity, in Big O notation, for each function, is in numerical order:
//
//		The (1) first function is being called recursively n times before reaching base case so its O(n), often called linear.
//		The (2) second function is called n-5 for each time, so we deduct five from n before calling the function, but n-5 is also O(n). (Actually called order of n/5 times. And, O(n/5) = O(n) ).
//		This (3)function is log(n) base 5, for every time we divide by 5 before calling the function so its O(log(n))(base 5), often called logarithmic and most often Big O notation and complexity analysis uses base 2.
//		In the (4) fourth, it's O(2^n), or exponential, since each function call calls itself twice unless it has been recursed n times.
//		As for the (5) last function, the for loop takes n/2 since we're increasing by 2, and the recursion take n-5 and since the for loop is called recursively therefore the time complexity is in (n-5) *(n/2) = (2n-10) * n = 2n^2- 10n, due to Asymptotic behavior and worst case scenario considerations or the upper bound that big O is striving for, we are only interested in the largest term so O(n^2).
//
//		Good luck on your midterms ;)


	int recursiveFun1(int n)    //  O(n)
	{
	    if (n <= 0)
	        return 1;
	    else
	        return 1 + recursiveFun1(n-1);
	}

	int recursiveFun2(int n)    //  O(n-5)  =   O(n)
	{
	    if (n <= 0)
	        return 1;
	    else
	        return 1 + recursiveFun2(n-5);
	}

	int recursiveFun3(int n)                 // O(log(n))(base 5)  but often base is 2
	{
	    if (n <= 0)
	        return 1;
	    else
	        return 1 + recursiveFun3(n/5);
	}

	void recursiveFun4(int n, int m, int o)    //  O(2^n)
	{
	    if (n <= 0)
	    {
	    	System.out.println("%d, %d\n" + m +" , " + o);
	    }
	    else
	    {
	        recursiveFun4(n-1, m+1, o);
	        recursiveFun4(n-1, m, o+1);      
	    }
	}

	int recursiveFun5(int n)
	{
	    for (int i = 0; i < n; i += 2) {
	        // do something
	    }

	    if (n <= 0)
	        return 1;
	    else
	        return 1 + recursiveFun5(n-5);  // have "for loop" inside.  Big O is:  (n-5) *(n/2) = (2n-10) * n = 2n^2- 10n
	}
	
	
	
	
}









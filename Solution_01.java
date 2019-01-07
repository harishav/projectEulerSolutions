public class Solution_01 {	
	
	public static void main(String[] args) {
		
		int n = 1000;
		
		long finalSum = sumOfNumbers(n-1,3) + sumOfNumbers(n-1,5) - sumOfNumbers(n-1,3*5);

		System.out.println(finalSum);
	}
	
	private static long sumOfNumbers(int limit, int div) {
		limit = limit/div; //sum numbers <= n that are divisible by d
		long sum = div*(limit*(limit+1)/2); // d * n(n+1)/2 -- number * sum of 1st n digits
		
		return sum;
	}
		    		
}

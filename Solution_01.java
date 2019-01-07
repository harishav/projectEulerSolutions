public class Solution_01 {	
	
	public static void main(String[] args) {
		
		int n = 1000;
		
		int maxThreeDiv = (n-1)/3;
		int maxFiveDiv = (n-1)/5;
		int maxFifteenDiv = (n-1)/15;
		
		long sumOfThreeDiv = 3*(maxThreeDiv*(maxThreeDiv+1)/2);
		long sumOfFiveDiv = 5*(maxFiveDiv*(maxFiveDiv+1)/2);
		long sumOfFifteenDiv = 15*(maxFifteenDiv*(maxFifteenDiv+1)/2);
		
		long finalSum = sumOfThreeDiv + sumOfFiveDiv - sumOfFifteenDiv;
		

		System.out.println(finalSum);
	}
		    		
}

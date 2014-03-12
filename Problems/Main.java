package problems;

public class Main {

	public static void main(String[] args){
		Problem1 problem1 = new Problem1();
		System.out.println("Problem 1: Sum of multiples of 3 and 5 below 1000 is "+problem1.sumofMultiplesof3and5());
	
		Problem2 problem2 = new Problem2();
		System.out.println("Problem 2: Sum of even fibonacci numbers below 4 million is "+problem2.findSumofEvenNosList(problem2.getFibonacciSequence(4000000)));
	}
}

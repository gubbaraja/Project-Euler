package problems;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

	public List<Integer> getFibonacciSequence(int lastInteger){
		int a=1,b=2;
		int c=a+b;
		
		List<Integer> fibonacciSeries = new ArrayList<Integer>();
		
		fibonacciSeries.add(a);
		fibonacciSeries.add(b);
		fibonacciSeries.add(c);
		
		while(c < lastInteger){
			a=b+c;
			b=c+a;
			c=a+b;
			
			if(a <= lastInteger)
				fibonacciSeries.add(a);
			if(b <= lastInteger)
				fibonacciSeries.add(b);
			if(c <= lastInteger)
				fibonacciSeries.add(c);
		}
		return fibonacciSeries;
	}
	
	
	public Integer findSumofEvenNosList(List<Integer> series){
		Integer sum = 0;
		
		for(Integer listSeries : series){
			if(listSeries%2 == 0){
				sum += listSeries;
			}
		}
		return sum;
	}
}

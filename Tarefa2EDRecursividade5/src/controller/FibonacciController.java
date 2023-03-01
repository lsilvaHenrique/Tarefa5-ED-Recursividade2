package controller;

public class FibonacciController {
	
	public FibonacciController () {} 
	
	public int fibonacciCalculo(int num){
		// Condicao de parada --> Quando num for igual a 0
		if(num == 0){
			return 0;
		}
		if(num == 1 || num == 2){
				return 1;
			}
		return fibonacciCalculo(num-2) + fibonacciCalculo(num-1);
		/*
		 6x
		 0 + 1 = 1
		 1 + 0 = 1
		 1 + 1 = 2
		 2 + 1 = 3
		 3 + 2 = 5
		 5 + 3 = 8
		 0 
		 */
		}
}

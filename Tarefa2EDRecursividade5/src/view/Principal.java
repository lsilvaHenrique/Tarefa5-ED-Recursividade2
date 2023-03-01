package view;

import controller.FibonacciController;

public class Principal {
	
	public static void main(String args[]) {
		int numeroMaximo = 20;
		
		FibonacciController fibo = new FibonacciController();
		
		System.out.print("Serie fibonacci de "+numeroMaximo+" numeros: ");
		
		for(int i = 0; i < numeroMaximo; i++){
				System.out.print(fibo.fibonacciCalculo(i) +" ");
			}
		}
}

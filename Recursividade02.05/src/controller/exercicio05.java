package controller;

public class exercicio05 {
	public exercicio05() {
		super();
	}

	public int fib(int n) {
// Se n for igual a 1 ou 2, então o Fibonacci retorna 1.
		if (n == 1 || n == 2) {
			return 1;
		} else {
// A sequência de Fibonacci soma o termo n-1 com termo n-2,
// até chegar no termo n de Fibonacci.
			return fib(n - 1) + fib(n - 2);
		}
	}
}

package controller;

public class Exercicio01 {
	public Exercicio01() {
		super();
	}

	public int fatorial(int n) {
// Quando o valor de n for 1, a função retorna 1 que é a fatorial de 1: !1 = 1		
		if (n == 1) {
			return 1;
		} else {
// O valor de n é multiplicado por n-1 até que n seja igual a 1.
			return n * fatorial(n - 1);
		}
	}
}
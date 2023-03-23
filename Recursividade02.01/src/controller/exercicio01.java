package controller;

public class exercicio01 {
	public exercicio01() {
		super();
	}

	public int naturais(int n) {
//Quando o valor de n for menor que 0, a função retorna 0 que é o fim da recursiva.
		if (n < 0) {
			return 0;
		} else {
// O valor de n é somado por n-1 até que n seja menor que 0.
			return n + naturais(n - 1);
		}
	}
}

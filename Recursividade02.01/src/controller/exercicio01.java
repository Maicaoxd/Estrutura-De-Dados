package controller;

public class exercicio01 {
	public exercicio01() {
		super();
	}

	public int naturais(int n) {
//Quando o valor de n for menor que 0, a fun��o retorna 0 que � o fim da recursiva.
		if (n < 0) {
			return 0;
		} else {
// O valor de n � somado por n-1 at� que n seja menor que 0.
			return n + naturais(n - 1);
		}
	}
}

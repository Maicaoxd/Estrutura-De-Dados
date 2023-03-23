package controller;

public class exercicio03 {
	public exercicio03() {
		super();
	}

	public Double serie(int n) {
// Quando n for 0, retorna 0 para a soma da série.		
		if (n == 0) {
			return (double) 0;
		} else {
// A cada recursiva n é decrescido em 1 e a série é somada.
			return (double) 1 / n + serie(n - 1);
		}
	}
}
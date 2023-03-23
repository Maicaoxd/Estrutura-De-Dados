package controller;

public class exercicio06 {
	public exercicio06() {
		super();
	}

	public Double fatorial(Double n) {
// Quando o valor de n for 1, a função retorna 1 que é a fatorial de 1: !1 = 1
		if (n == 1) {
			return (double) 1;
		} else {
// O valor de n é multiplicado por n-1 até que n seja igual a 1.
			return n * fatorial(n - 1);
		}
	}

	public Double serieFat(Double n) {
// Quando n for 0, retorna 0 para a soma da série.	
		if (n == 1) {
			return (double) 1;
		} else {
// A cada recursiva n é decrescido em 1 e a série é somada.
			return  1 / fatorial(n) + serieFat(n - 1);
		}
	}
}
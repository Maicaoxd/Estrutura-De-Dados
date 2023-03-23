package controller;

public class exercicio06 {
	public exercicio06() {
		super();
	}

	public Double fatorial(Double n) {
// Quando o valor de n for 1, a fun��o retorna 1 que � a fatorial de 1: !1 = 1
		if (n == 1) {
			return (double) 1;
		} else {
// O valor de n � multiplicado por n-1 at� que n seja igual a 1.
			return n * fatorial(n - 1);
		}
	}

	public Double serieFat(Double n) {
// Quando n for 0, retorna 0 para a soma da s�rie.	
		if (n == 1) {
			return (double) 1;
		} else {
// A cada recursiva n � decrescido em 1 e a s�rie � somada.
			return  1 / fatorial(n) + serieFat(n - 1);
		}
	}
}
package controller;

public class exercicio04 {
	public exercicio04() {
		super();
	}

	public int contains(int n1, int n2) {
// Quando o valor for igual a 0, retorne 0 a soma de quantidade.
		if (n1 == 0) {
			return 0;
		} else {
// Se o valor dividido por 10 tiver o resto igual ao número comparado, retorne 1, 
// E dívida o valor por 10 para avançar uma casa, caso contrario, apenas retorne o valor divido por 10.
			if (n1 % 10 == n2) {
				return 1 + contains(n1 / 10, n2);
			} else {
				return contains(n1 / 10, n2);
			}
		}
	}
}

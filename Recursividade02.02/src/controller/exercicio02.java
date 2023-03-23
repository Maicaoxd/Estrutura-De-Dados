package controller;

public class exercicio02 {
	public exercicio02() {
		super();
	}

	public String binarios(int n) {
		if (n > 2000) {
			return "VALOR ACIMA DO LIMITE";
		}
//Quando o valor de n for igual a 0, a funçao retorna "" que é o fim da recursiva.
		if (n == 0) {
			return "";
		}
// O binario � escrito de trás para frente.
		if (n % 2 == 0) {
// Quando n divido por 2 resultar em resto 0, retorna 0 para o binario.
			return binarios(n / 2) + "0";
		} else {
// Quando n divido por 2 resultar em resto 1, retorna 1 para o binario.
			return binarios(n / 2) + "1";
		}
	}
}

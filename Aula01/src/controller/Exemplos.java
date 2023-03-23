package controller;

public class Exemplos {
	public Exemplos() {
		super();
	}

	public int potencia01(int base, int expoente) {
		if (expoente == 0) {
			return 1;
		} else {
			expoente = expoente - 1;
			return base * potencia01(base, expoente);
		}
	}

	public int divisao02(int dividendo, int divisor) {
		if (dividendo < divisor) {
			return 0;
		} else {
			dividendo = dividendo - divisor;
			return 1 + divisao02(dividendo, divisor);
		}
	}

	public int vetor03(int[] vetor, int tamanho) {
		if (tamanho == 0) {
			return 0;
		} else {
			int ultimaPosicao = tamanho - 1;
			int valor = vetor[ultimaPosicao];
			tamanho = tamanho - 1;
			return valor + vetor03(vetor, tamanho);
		}
	}
}

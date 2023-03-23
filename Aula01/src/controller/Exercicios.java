package controller;

public class Exercicios {
	public Exercicios() {
		super();
	}

	public int multiplicacao01(int fatorA, int fatorB) {
		if (fatorB == 0) {
			return 0;
		} else {
			fatorB = fatorB - 1;
			return fatorA + multiplicacao01(fatorA, fatorB);
		}
	}

	public int resto02(int dividendo, int divisor) {
		if (dividendo < divisor) {
			return dividendo;
		} else {
			dividendo = dividendo - divisor;
			return resto02(dividendo, divisor);
		}
	}

	public int vetorPar03(int tamanho) {
		if (tamanho == 0) {
			return 0;
		} else {
			if (tamanho % 2 == 0) {
				tamanho = tamanho - 1;
				return 1 + vetorPar03(tamanho);
			} else {
				tamanho = tamanho - 1;
				return vetorPar03(tamanho);
			}
		}
	}
}
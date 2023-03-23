package controller;

public class Exercicio02 {
	public Exercicio02() {
		super();
	}

	public int VetorNegativo(int[] vetor, int tamanho) {
// Quando o tamanho do vetor chegar a 0, ou seja, não tiver mais elementos, a recursão retorna 0.
		if (tamanho == 0) {
			return 0;
		} else {
// A cada recursão verifica-se se o valor correspondente é positivo ou negativo, caso seja
// negativo, 1 é acrescentado a recursão e o tamanho do vetor é decrescido, caso seja positivo,
// apenas é decrescido o tamanho do vetor.
			int ultimaposicao = tamanho - 1;
			int valor = vetor[ultimaposicao];
			tamanho--;
			if (valor < 0) {
				return 1 + VetorNegativo(vetor, tamanho);
			} else {
				return VetorNegativo(vetor, tamanho);
			}
		}
	}
}

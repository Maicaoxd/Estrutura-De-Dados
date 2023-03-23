package controller;

public class Exercicio04 {
	public Exercicio04() {
		super();
	}

	public String Inversao(String palavra, int tamanho) {
// Quando o tamanho da palavra chegar a 0 significa que não há mais letras, ou seja, vazio.
		if (tamanho == 0) {
			return "";
		} else {
// A cada letra escrita é necessário decrescer em 1 o tamanho da palavra.
			int posInicial = tamanho - 1;
			int posFinal = tamanho;
			return palavra.substring(posInicial, posFinal) + Inversao(palavra, tamanho - 1);
		}
	}
}

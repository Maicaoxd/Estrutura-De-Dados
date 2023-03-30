package view;

import br.edu.fateczl.pilhas.PilhaInt;

public class Exercicio02 {

	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt();
		int[] vet = { 0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5 };
		int x = 0, y = 0, soma;
		for (int i : vet) {
			if (i >= 0) {
				pilha.push(i);
			}
			if (i < 0) {
				try {
					x = pilha.pop();
					y = pilha.pop();
				} catch (Exception e) {
					e.printStackTrace();
				}
				soma = x + y;
				pilha.push(i);
				pilha.push(soma);
			}
		}
		System.out.println("Size = " + pilha.size());
	}

}

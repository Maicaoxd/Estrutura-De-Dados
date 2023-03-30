package view;

import br.edu.fateczl.pilhaint.Pilha;

public class Exercicio01 {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		int v1 = 0;
		int[] vetor = { 100, 200, 1, 50, 39, 44, 25, 16, 99, 45, 33, 18, 102, 92 };
		int tamanhoVetor = vetor.length;
		for (int i = 0; i < tamanhoVetor; i++) {
			if (p.isEmpty()) {
				p.push(vetor[i] - 10);
			} else if (vetor[i] % 5 == 0) {
				p.push(vetor[i] / 5);
			} else if (vetor[i] % 3 == 0) {
				p.push(vetor[i] * 3);
			} else {
				try {
					v1 = p.pop();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(v1 / 2);
			}
		}
	}
}

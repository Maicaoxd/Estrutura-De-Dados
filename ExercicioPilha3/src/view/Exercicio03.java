package view;

import br.edu.fateczl.pilhas.PilhaString;

public class Exercicio03 {

	public static void main(String[] args) {
		PilhaString pilha = new PilhaString();
		PilhaString auxiliar = new PilhaString();
		String[] vet = { "W", "L", "H", "B", "R", "G", "J" };

		for (String i : vet) {
			pilha.push(i);
		}

		while (!pilha.isEmpty()) {
			try {
				String aux = pilha.pop();
				if (aux.equals("R") || aux.equals("W")) {
					System.out.print(aux + " ");
				} else {
					auxiliar.push(aux);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		while (!auxiliar.isEmpty()) {
			String aux;
			try {
				aux = auxiliar.pop();
				if (!aux.equals("H") && !aux.equals("J")) {
					pilha.push(aux);
					if (aux.equals("B")) {
						pilha.push("M");
					}
					if (aux.equals("G")) {
						pilha.push("K");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
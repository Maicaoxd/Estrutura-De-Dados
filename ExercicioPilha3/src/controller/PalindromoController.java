package controller;

import br.edu.fateczl.pilhas.PilhaString;

public class PalindromoController {

	public PalindromoController() {
		super();
	}

	public String invertePalavra(PilhaString p, String palavra) {
		int tamanho = palavra.length();
		String invertido = "";
		String letra = "";
		
		for (int i = 0; i < tamanho; i++) {
			char c = palavra.charAt(i);
			p.push(Character.toString(c));
		}

		while (!p.isEmpty()) {
			try {
				letra = p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			invertido = invertido + letra;
		}

		return invertido;
	}

	public boolean comparaPalavras(PilhaString p, String palavra, String invertido) {
		if (palavra.equals(invertido)) {
			return true;
		} else {
			return false;
		}
	}

}

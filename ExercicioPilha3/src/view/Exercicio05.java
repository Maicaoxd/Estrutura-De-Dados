package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhas.PilhaString;
import controller.PalindromoController;

public class Exercicio05 {

	public static void main(String[] args) {
		PilhaString p = new PilhaString();
		PalindromoController palindromo = new PalindromoController();

		String palavra = JOptionPane.showInputDialog("Insira a palavra");
		String invertido = palindromo.invertePalavra(p, palavra);
		System.out.println(palindromo.comparaPalavras(p, palavra, invertido));
	}

}

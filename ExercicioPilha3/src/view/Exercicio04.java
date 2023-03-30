package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhas.PilhaInt;
import controller.NPRController;

public class Exercicio04 {
	public static void main(String[] args) {
		PilhaInt p = new PilhaInt();
		NPRController n = new NPRController();
		String op;

		do {
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira valor"));
			n.insereValor(p, valor);
			op = JOptionPane.showInputDialog("Insira operacao");
		} while (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/"));
		System.out.println("Resultado " + n.npr(p, op));
	}
}

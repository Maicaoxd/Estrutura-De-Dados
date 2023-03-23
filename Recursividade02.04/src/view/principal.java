package view;

import javax.swing.JOptionPane;

import controller.exercicio04;

public class principal {

	public static void main(String[] args) {
		exercicio04 ex = new exercicio04();
		int n1, n2;
		do {
			n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o N1 "));
		} while (n1 < 10 || n1 > 999999);
		do {
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o N2 "));
		} while (n2 < 0 || n2 > 9);
		int quantidade = ex.contains(n1, n2);
		System.out.println("Quantidade = " + quantidade);
	}

}

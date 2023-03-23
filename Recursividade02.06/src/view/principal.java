package view;

import javax.swing.JOptionPane;

import controller.exercicio06;

public class principal {

	public static void main(String[] args) {
		exercicio06 ex = new exercicio06();
		Double n;
		do {
			n = Double.parseDouble(JOptionPane.showInputDialog("Insira o N "));
		} while (n > 10);
		Double serie = ex.serieFat(n);
		System.out.println("Serie = " + serie);
	}

}

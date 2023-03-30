package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Exercicio03 {

	public static void main(String[] args) {
		ConverteController converter = new ConverteController();
		int decimal;
		do {
			decimal = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do decimal"));
		} while (decimal < 0 || decimal > 1000);
		String binario = converter.decToBin(decimal);
		System.out.println(binario);
	}

}

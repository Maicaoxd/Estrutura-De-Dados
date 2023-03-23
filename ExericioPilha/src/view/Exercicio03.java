package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Exercicio03 {
	public static void main(String[] args) {
		FatController fat = new FatController();
		int n = -1;
		while (n < 0 || n > 10) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de n"));
		}
		int f = fat.Fat(n);
		System.out.println(f);
	}
}

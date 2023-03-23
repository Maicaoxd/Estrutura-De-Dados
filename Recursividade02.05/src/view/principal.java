package view;

import javax.swing.JOptionPane;

import controller.exercicio05;

public class principal {

	public static void main(String[] args) {
		exercicio05 ex = new exercicio05();
		int n;
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de n"));
		} while (n > 20);
		int fib = ex.fib(n);
		System.out.println("Fibonnaci = " + fib);
	}

}

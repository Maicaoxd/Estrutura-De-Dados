package view;

import controller.exercicio01;

public class principal {

	public static void main(String[] args) {
		exercicio01 ex = new exercicio01();
		int n = 5;
		int soma = ex.naturais(n);
		System.out.println("Soma = " + soma);
	}

}

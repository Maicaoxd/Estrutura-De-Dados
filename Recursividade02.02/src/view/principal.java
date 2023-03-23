package view;

import controller.exercicio02;

public class principal {

	public static void main(String[] args) {
		exercicio02 ex = new exercicio02();
		int n = 4;
		String binario = ex.binarios(n);
		System.out.println("Binario = " + binario);
	}

}

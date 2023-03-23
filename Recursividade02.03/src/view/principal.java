package view;

import controller.exercicio03;

public class principal {

	public static void main(String[] args) {
		exercicio03 ex = new exercicio03();
		int n = 6;
		Double serie = ex.serie(n);
		System.out.println("Serie = " + serie);
	}

}

package controller;

import br.edu.fateczl.pilhas.PilhaInt;

public class ConverteController {

	public ConverteController() {
		super();
	}

	public String decToBin(int decimal) {
		PilhaInt p = new PilhaInt();
		while (decimal != 0) {
			if (decimal % 2 == 0) {
				p.push(0);
				decimal /= 2;
			} else {
				p.push(1);
				decimal /= 2;
			}
		}
		int binario = 0;
		while (!p.isEmpty()) {
			try {
				binario *= 10;
				binario += p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		String convertido = String.valueOf(binario);
		return convertido;
	}

}

package controller;

import br.edu.fateczl.pilhas.PilhaInt;

public class NPRController {

	public NPRController() {
		super();
	}

	public void insereValor(PilhaInt p, int valor) {
		p.push(valor);
	}

	public int npr(PilhaInt p, String op) {
		int x = 0, y = 0, res = 0;

		try {
			x = p.pop();
			y = p.pop();
		} catch (Exception e) {
			System.out.println("Valores insuficientes");
		}

		switch (op) {
		case "+":
			res = y + x;
			p.push(res);
		case "-":
			res = y - x;
			p.push(res);
		case "*":
			res = y * x;
			p.push(res);
		case "/":
			res = y / x;
			p.push(res);
		}
		return res;

	}

}

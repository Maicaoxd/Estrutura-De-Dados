package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class FatController {

	public FatController() {
		super();
	}

	public int Fat(int valor) {
		Pilha p = new Pilha();
		int v1 = 1;
		for (int i = valor - 1; i > 1; i--) {
			p.push(i);
			try {
				v1 = p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			valor *= v1;
		}
		return valor;
	}

}

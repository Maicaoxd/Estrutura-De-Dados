package controller;

import br.edu.fateczl.fila.FilaObj;

public class EscalonadorController {

	public EscalonadorController() {
		super();
	}

	public void escalonador(FilaObj fila) {

		while (!fila.isEmpty()) {
			try {
				String processo = (String) fila.remove();
				String[] separa = processo.split(";");
				String nome = separa[0];
				int qtdRetornos = Integer.parseInt(separa[1]);
				if (qtdRetornos > 1) {
					qtdRetornos--;
					fila.insert(nome + ";" + qtdRetornos);
				} else {
					System.out.println(nome+" executou");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

package controller;

import br.edu.fateczl.fila.FilaString;

public class TelefoneController {

	public TelefoneController() {
		super();
	}

	public void insereLigacao(FilaString f, String numeroTelefone) {
		f.insert(numeroTelefone);
	}

	public void consultaLigacao(FilaString f) throws Exception {
		if (!f.isEmpty()) {
			String telefone = f.remove();
			System.out.println("ligação recebida de : " + telefone);
		} else {
			throw new Exception("Não há ligações !!!");
		}
	}

}

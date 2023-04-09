package controller;

import br.edu.fateczl.fila.FilaString;

public class ImpressoraController {

	public ImpressoraController() {
		super();
	}

	public void insereDocumento(FilaString f, String documento) {
		f.insert(documento);
	}

	public void imprime(FilaString f) throws Exception {
		if (!f.isEmpty()) {
			String documento = f.remove();
			String[] separa = documento.split(";");
			int id = Integer.parseInt(separa[0]);
			String arquivo = separa[1];
			System.out.println("#PC: " + id + " - Arquivo: " + arquivo);
			int tempo = (int) ((Math.random() * 2) + 1);
			Thread.sleep(tempo * 1000);
			System.out.println("Impressão concluída");
		} else {
			throw new Exception("Não há documento para imprimir");
		}
	}

}

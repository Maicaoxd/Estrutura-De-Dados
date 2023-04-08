package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.fila.FilaObj;

public class FilaController {

	private static int cont;

	public FilaController() {
		super();
	}

	public void inserirFila(FilaObj fila) {
		Object senha = (JOptionPane.showInputDialog("Insira a senha"));
		fila.insert(senha);
	}

	public void removerFila(FilaObj fila) throws Exception {
		if (!fila.isEmpty()) {
			try {
				Object senha = fila.remove();
				System.out.println("senha: " + senha);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			throw new Exception("Não há senhas !!!");
		}
	}

	public void chamarSenha(FilaObj fila, FilaObj prioritaria) throws Exception {
		if (cont < 3 && !prioritaria.isEmpty()) {
			try {
				removerFila(prioritaria);
				cont++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (!fila.isEmpty()) {
			try {
				removerFila(fila);
				cont = 0;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			throw new Exception("Não há senhas para serem chamadas !!!");
		}
	}
}

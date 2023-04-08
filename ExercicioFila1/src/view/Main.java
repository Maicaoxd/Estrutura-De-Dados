package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.fila.FilaObj;
import controller.FilaController;

public class Main {

	public static void main(String[] args) {
		FilaObj fila = new FilaObj();
		FilaObj filaprioritarios = new FilaObj();
		FilaController controller = new FilaController();

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"\n 1 - Inserir nova senha na fila\n 2 - Inserir nova senha na fila prioritarios\n 3 - Chamar próxima senha\n 9 - Sair"));
			switch (opc) {
			case 1:
				controller.inserirFila(fila);
				break;
			case 2:
				controller.inserirFila(filaprioritarios);
				break;
			case 3:
				try {
					controller.chamarSenha(fila, filaprioritarios);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}

}
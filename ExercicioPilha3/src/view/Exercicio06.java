package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhas.PilhaString;
import controller.HistoricoController;

public class Exercicio06 {

	public static void main(String[] args) {
		PilhaString historico = new PilhaString();
		HistoricoController h = new HistoricoController();

		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"\n 1 - Inserir novo endereço\n 2 - Remover último endereço\n 3 - Consulta último endereço visitado\n 9 - Sair"));
			switch (opc) {
			case 1:
				String validacao = h.inserirEndereco(historico);
				System.out.println(validacao);
				break;
			case 2:
				h.removerEndereco(historico);
				break;
			case 3:
				h.consultarEndereco(historico);
				break;
			default:
				break;
			}
		}
	}
}

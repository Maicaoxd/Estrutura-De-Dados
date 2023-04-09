package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.fila.FilaString;
import controller.TelefoneController;

public class Main02 {

	public static void main(String[] args) {
		FilaString f = new FilaString();
		TelefoneController c = new TelefoneController();
		int opc = 0;

		while (opc != 9) {
			opc = Integer
					.parseInt(JOptionPane.showInputDialog("\n 1 - Inserir Ligação\n 2 - Consulta ligação\n 9 - Sair"));
			switch (opc) {
			case 1:
				String numeroTelefone = JOptionPane.showInputDialog("Insira o número de telefone");
				c.insereLigacao(f, numeroTelefone);
				break;
			case 2:
				try {
					c.consultaLigacao(f);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}

}

package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.fila.FilaString;
import controller.ImpressoraController;

public class Main04 {

	public static void main(String[] args) {
		FilaString f = new FilaString();
		ImpressoraController c = new ImpressoraController();
		int opc = 0;

		while (opc != 9) {
			opc = Integer
					.parseInt(JOptionPane.showInputDialog("\n 1 - Inserir Documento\n 2 - Imprimir\n 9 - Sair"));
			switch (opc) {
			case 1:
				String documento = JOptionPane.showInputDialog("Insira o documento");
				if (documento.contains(";")) {
					c.insereDocumento(f, documento);
				} else {
					System.out.println("Documento Inválido !!!");
				}
				break;
			case 2:
				try {
					c.imprime(f);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}

}

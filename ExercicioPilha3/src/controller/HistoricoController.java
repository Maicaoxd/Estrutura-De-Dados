package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.pilhas.PilhaString;

public class HistoricoController {

	public HistoricoController() {
		super();
	}

	public String inserirEndereco(PilhaString historico) {

		String endereco = JOptionPane.showInputDialog("Insira o endereço ");
		if (endereco.contains("http://")) {
			if (endereco.contains("www.")) {
				if (endereco.contains(".com") || endereco.contains(".co.uk") || endereco.contains(".com.br")) {
					historico.push(endereco);
					return "Endereço Válido";
				}
			}
		}
		return "Endereço Inválido";
	}

	public void removerEndereco(PilhaString historico) {

		if (!historico.isEmpty()) {

			try {
				historico.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (historico.isEmpty()) {
				System.out.println("Erro, último endereço foi desempilhado");
			} else {
				System.out.println("Endereço apagado");
			}

		} else {
			System.out.println("Erro, Histórico vazio");
		}
	}
	
	public void consultarEndereco (PilhaString historico) {
		if (!historico.isEmpty()) {
			try {
				System.out.println("Último endereço visitado: " + historico.top());
			} catch (Exception e) {
				e.printStackTrace();
			}  if (historico.size() <=1) {
				System.out.println("Erro, Histórico só possui o endereço acima");
			}
		} else {
			System.out.println("Erro, Histórico vazio");
		}
	}
	
}

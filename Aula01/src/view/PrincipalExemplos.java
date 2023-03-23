package view;

import javax.swing.JOptionPane;
import controller.Exemplos;

public class PrincipalExemplos {
	public static void main(String[] args) {
		Exemplos exe = new Exemplos();
		int opc;
		opc = Integer.parseInt(JOptionPane.showInputDialog("Insira o número do exemplo "));
		switch (opc) {
		case 1:
			int base = 2;
			int expoente = 6;
			int pot = exe.potencia01(base, expoente);
			System.out.println("Potencia = " + pot);
			break;
		case 2:
			int dividendo = 25;
			int divisor = 5;
			int div = exe.divisao02(dividendo, divisor);
			System.out.println("Resultado = " + div);
			break;
		case 3:
			int[] vetor = { 4, 8, 9, 5, 3, 7, 10, 7, 9, 1, 2 };
			int tamanho = vetor.length;
			int vet = exe.vetor03(vetor, tamanho);
			System.out.println("Valor = " + vet);
		default:
			break;
		}
	}
}
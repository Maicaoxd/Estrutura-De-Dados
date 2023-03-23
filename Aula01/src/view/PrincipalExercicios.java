package view;

import javax.swing.JOptionPane;
import controller.Exercicios;

public class PrincipalExercicios {
	public static void main(String[] args) {
		int opc;
		opc = Integer.parseInt(JOptionPane.showInputDialog("Insira o exercício a ser executado"));
		Exercicios ex = new Exercicios();
		switch (opc) {
		case 1:
			int fatorA;
			int fatorB;
			fatorA = 2;
			fatorB = 3;
			int mul = ex.multiplicacao01(fatorA, fatorB);
			System.out.println("Produto = " + mul);
			break;
		case 2:
			int dividendo = 24;
			int divisor = 5;
			int resto = ex.resto02(dividendo, divisor);
			System.out.println("resto = " + resto);
			break;
		case 3:
			int[] vetor = { 4, 8, 9, 5, 3, 7, 10, 7, 9, 1, 2 };
			int tamanho = vetor.length;
			int vet = ex.vetorPar03(tamanho);
			System.out.println("Quantidade de posições pares = " + vet);
		default:
			break;
		}
	}
}
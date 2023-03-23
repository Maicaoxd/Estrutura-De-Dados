package view;

import javax.swing.JOptionPane;

import controller.*;

public class Principal {
	public static void main(String[] args) {
		int opc;
		opc = Integer.parseInt(JOptionPane.showInputDialog("Insira o número do exercício "));
		switch (opc) {
		case 1:
			Exercicio01 ex1 = new Exercicio01();
			int n = 5;
			int fat = ex1.fatorial(n);
			System.out.println("O fatorial de " + n + " é de: " + fat);
			break;
		case 2:
			Exercicio02 ex2 = new Exercicio02();
			int[] vetor = { 4, 8, -9, 0, 5, -3, 10, 7, -9, 1, -2, -10 };
			int tamanho = vetor.length;
			int neg = ex2.VetorNegativo(vetor, tamanho);
			System.out.println("A quantidade de elementos negativos é de: " + neg);
			break;
		case 3:
			Exercicio03 ex3 = new Exercicio03();
			int numero = -1768;
			int dig = ex3.Digitos(numero);
			System.out.println("O número " + numero + " possui " + dig + " digito(s)");
			break;
		case 4:
			Exercicio04 ex4 = new Exercicio04();
			String palavra = "edcba";
			int tamanho1 = palavra.length();
			String inv = ex4.Inversao(palavra, tamanho1);
			System.out.println(inv);
			break;
		default:
			break;
		}
	}
}
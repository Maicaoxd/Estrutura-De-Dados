package controller;

public class Exercicio03 {
	public Exercicio03() {
		super();
	}

	public int Digitos(int numero) {
// Número positivo
		if (numero >= 0) {
// Quando o número for < 10 significa que é apenas um dígito, ou seja, retorna 1.
			if (numero < 10) {
				return 1;
			} else {
// A cada recursão o numero é dividido por 10 para que uma casa de unidade seja "movida" 
// e é acrescida em 1 a recursão.
				return 1 + Digitos(numero / 10);
			}
// Número negativo
		} else {
			if (numero > -10) {
				return 1;
			} else {
				return 1 + Digitos(numero / 10);
			}
		}
	}
}
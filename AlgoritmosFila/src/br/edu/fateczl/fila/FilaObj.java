package br.edu.fateczl.fila;

public class FilaObj {

	NoObj inicio;
	NoObj fim;

	public FilaObj() {
		inicio = null;
		fim = null;
	}

	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		} else {
			return false;
		}
	}

	public void insert(Object valor) {
		NoObj elemento = new NoObj();
		elemento.dado = valor;
		elemento.proximo = null;
		if (isEmpty()) {
			inicio = elemento;
			fim = inicio;
		} else {
			if (inicio == fim && inicio != null) {
				fim = elemento;
				inicio.proximo = fim;
			} else {
				fim.proximo = elemento;
				fim = elemento;
			}
		}
	}

	public Object remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Fila Vazia !!!");
		}
		Object valor = inicio.dado;
		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = inicio;
		} else {
			inicio = inicio.proximo;
		}
		return valor;
	}

	public void list() throws Exception {
		if (isEmpty()) {
			throw new Exception("Fila Vazia !!!");
		}
		NoObj auxiliar = inicio;
		while (auxiliar != null) {
			System.out.print(auxiliar.dado + " ");
			auxiliar = auxiliar.proximo;
		}
	}

	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			NoObj auxiliar = inicio;
			while (auxiliar != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
}

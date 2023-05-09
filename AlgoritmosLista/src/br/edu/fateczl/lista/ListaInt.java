package br.edu.fateczl.lista;

public class ListaInt {

	NoInt primeiro;

	public ListaInt() {
		primeiro = null;
	}

	public boolean isEmpty() {
		if (primeiro == null) {
			return true;
		} else {
			return false;
		}
	}

	public void addFirst(int valor) {
		NoInt elemento = new NoInt();
		elemento.dado = valor;
		elemento.proximo = primeiro;
		primeiro = elemento;
	}

	public void addLast(int valor) throws Exception {
		int tamanho = size();

		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		NoInt elemento = new NoInt();
		elemento.dado = valor;
		elemento.proximo = null;

		NoInt ultimo = getNo(tamanho - 1);
		ultimo.proximo = elemento;
	}

	public void add(int valor, int pos) throws Exception {
		int tamanho = size();
		if (pos < 0 || pos > tamanho) {
			throw new Exception("Posição Inválida");
		}
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		if (pos == 0) {
			addFirst(valor);
		} else if (pos == tamanho) {
			addLast(valor);
		} else {
			NoInt elemento = new NoInt();
			elemento.dado = valor;
			NoInt anterior = getNo(pos - 1);
			elemento.proximo = anterior.proximo;
			anterior.proximo = elemento;
		}
	}

	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			NoInt auxiliar = primeiro;
			while (auxiliar != null) {
				auxiliar = auxiliar.proximo;
				cont++;
			}
		}
		return cont;
	}

	public int get(int pos) throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		int tamanho = size();
		if (pos < 0 || pos > tamanho - 1) {
			throw new Exception("Posição Inválida");
		}
		NoInt auxiliar = primeiro;
		int cont = 0;
		while (cont < pos) {
			auxiliar = auxiliar.proximo;
			cont++;
		}
		int valor = auxiliar.dado;
		return valor;
	}

	public void removeFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		primeiro = primeiro.proximo;
	}

	public void removeLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		int tamanho = size();
		NoInt penultimo = getNo(tamanho - 2);
		penultimo.proximo = null;
	}

	public void remove(int pos) throws Exception {
		int tamanho = size();
		if (pos < 0 || pos > tamanho - 1) {
			throw new Exception("Posição Inválida");
		}
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		if (pos == 0) {
			removeFirst();
		} else {
			NoInt atual = getNo(pos);
			NoInt anterior = getNo(pos - 1);
			anterior.proximo = atual.proximo;
		}
	}

	private NoInt getNo(int pos) throws Exception {
		if (pos < 0) {
			throw new Exception("Posição Inválida");
		}
		NoInt auxiliar = primeiro;
		int cont = 0;
		while (cont < pos) {
			auxiliar = auxiliar.proximo;
			cont++;
		}
		return auxiliar;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		try {
			int tamanho = size();
			for (int i = 0; i < tamanho; i++) {
				buffer.append("[ ");
				buffer.append(get(i));
				buffer.append(" ]");
				buffer.append("[]->");
				if (i == tamanho - 1) {
					buffer.append("NULL");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return buffer.toString();
	}

}

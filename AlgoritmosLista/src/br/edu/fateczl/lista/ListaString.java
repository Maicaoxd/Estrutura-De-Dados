package br.edu.fateczl.lista;

public class ListaString {

	NoString primeiro;

	public ListaString() {
		primeiro = null;
	}

	public boolean isEmpty() {
		if (primeiro == null) {
			return true;
		} else {
			return false;
		}
	}

	public void addFirst(String valor) {
		NoString elemento = new NoString();
		elemento.dado = valor;
		elemento.proximo = primeiro;
		primeiro = elemento;
	}

	public void addLast(String valor) throws Exception {
		int tamanho = size();

		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		NoString elemento = new NoString();
		elemento.dado = valor;
		elemento.proximo = null;

		NoString ultimo = getNo(tamanho - 1);
		ultimo.proximo = elemento;
	}

	public void add(String valor, int pos) throws Exception {
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
			NoString elemento = new NoString();
			elemento.dado = valor;
			NoString anterior = getNo(pos - 1);
			elemento.proximo = anterior.proximo;
			anterior.proximo = elemento;
		}
	}

	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			NoString auxiliar = primeiro;
			while (auxiliar != null) {
				auxiliar = auxiliar.proximo;
				cont++;
			}
		}
		return cont;
	}

	public String get(int pos) throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		int tamanho = size();
		if (pos < 0 || pos > tamanho - 1) {
			throw new Exception("Posição Inválida");
		}
		NoString auxiliar = primeiro;
		int cont = 0;
		while (cont < pos) {
			auxiliar = auxiliar.proximo;
			cont++;
		}
		String valor = auxiliar.dado;
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
		NoString penultimo = getNo(tamanho - 2);
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
			NoString atual = getNo(pos);
			NoString anterior = getNo(pos - 1);
			anterior.proximo = atual.proximo;
		}
	}

	private NoString getNo(int pos) throws Exception {
		if (pos < 0) {
			throw new Exception("Posição Inválida");
		}
		NoString auxiliar = primeiro;
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

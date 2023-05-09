package br.edu.fateczl.lista;

public class ListaObject {

	NoObj primeiro;

	public ListaObject() {
		primeiro = null;
	}

	public boolean isEmpty() {
		if (primeiro == null) {
			return true;
		} else {
			return false;
		}
	}

	public void addFirst(Object valor) {
		NoObj elemento = new NoObj();
		elemento.dado = valor;
		elemento.proximo = primeiro;
		primeiro = elemento;
	}

	public void addLast(Object valor) throws Exception {
		int tamanho = size();

		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		NoObj elemento = new NoObj();
		elemento.dado = valor;
		elemento.proximo = null;

		NoObj ultimo = getNo(tamanho - 1);
		ultimo.proximo = elemento;
	}

	public void add(Object valor, int pos) throws Exception {
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
			NoObj elemento = new NoObj();
			elemento.dado = valor;
			NoObj anterior = getNo(pos - 1);
			elemento.proximo = anterior.proximo;
			anterior.proximo = elemento;
		}
	}

	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			NoObj auxiliar = primeiro;
			while (auxiliar != null) {
				auxiliar = auxiliar.proximo;
				cont++;
			}
		}
		return cont;
	}

	public Object get(int pos) throws Exception {
		if (isEmpty()) {
			throw new Exception("Lista Vazia");
		}
		int tamanho = size();
		if (pos < 0 || pos > tamanho - 1) {
			throw new Exception("Posição Inválida");
		}
		NoObj auxiliar = primeiro;
		int cont = 0;
		while (cont < pos) {
			auxiliar = auxiliar.proximo;
			cont++;
		}
		Object valor = auxiliar.dado;
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
		NoObj penultimo = getNo(tamanho - 2);
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
			NoObj atual = getNo(pos);
			NoObj anterior = getNo(pos - 1);
			anterior.proximo = atual.proximo;
		}
	}

	private NoObj getNo(int pos) throws Exception {
		if (pos < 0) {
			throw new Exception("Posição Inválida");
		}
		NoObj auxiliar = primeiro;
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

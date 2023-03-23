package br.edu.fateczl.pilhas;

public class PilhaInt {

	NoInt topo;
	
	public PilhaInt() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void push (int e) {
		NoInt elemento = new NoInt();
		elemento.dado = e;
		
		if (isEmpty()) {
			topo = elemento;
		} else {
			elemento.proximo = topo;
			topo = elemento;
		}
	}
	
	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha vazia");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		
		return valor;
	}
	
	public int top() throws Exception {
		if (isEmpty()) {
			throw new Exception("Pilha vazia");
		}
		return topo.dado;
	}

	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			NoInt auxiliar = topo;
			cont = 1;
			while (auxiliar.proximo != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		NoInt auxiliar = topo;
		int cont = 0; 
		while (cont < size()) {
			sb.append("| " + auxiliar.dado + " |" + "\n" );
			auxiliar = auxiliar.proximo;
			cont++;
		}
		return sb.toString();
	}
	
}

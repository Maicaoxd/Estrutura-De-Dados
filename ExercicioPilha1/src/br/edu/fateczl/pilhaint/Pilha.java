package br.edu.fateczl.pilhaint;

public class Pilha {

	No topo;
	
	public Pilha() {
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
		No elemento = new No();
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
			No auxiliar = topo;
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
		No auxiliar = topo;
		int cont = 0; 
		while (cont < size()) {
			sb.append("| " + auxiliar.dado + " |" + "\n" );
			auxiliar = auxiliar.proximo;
			cont++;
		}
		return sb.toString();
	}
	
}

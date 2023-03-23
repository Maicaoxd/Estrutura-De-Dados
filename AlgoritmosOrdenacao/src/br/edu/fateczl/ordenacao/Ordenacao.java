package br.edu.fateczl.ordenacao;

public class Ordenacao {
	public Ordenacao() {
		super();
	}

	public int[] bubbleSort(int[] vetor) {
		int tamanho = vetor.length;
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
		return vetor;
	}

	public int[] mergeSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(vetor, inicio, meio);
			mergeSort(vetor, meio + 1, fim);
			intercala(vetor, inicio, meio, fim);
		}
		return vetor;
	}

	private void intercala(int[] vetor, int inicio, int meio, int fim) {
		int[] novoVetor = new int[vetor.length];
		for (int i = inicio; i <= fim; i++) {
			novoVetor[i] = vetor[i];
		}

		int esq = inicio;
		int dir = meio + 1;

		for (int cont = inicio; cont <= fim; cont++) {
			if (esq > meio) {
				vetor[cont] = novoVetor[dir];
				dir++;
			} else if (dir > fim) {
				vetor[cont] = novoVetor[esq];
				esq++;
			} else if (novoVetor[esq] < novoVetor[dir]) {
				vetor[cont] = novoVetor[esq];
				esq++;
			} else {
				vetor[cont] = novoVetor[dir];
				dir++;
			}
		}
	}

	public int[] quickSort(int[] vetor, int inicio, int fim) {
		if (fim > inicio) {
			int posicaoPivoFixo = dividir(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivoFixo - 1);
			quickSort(vetor, posicaoPivoFixo + 1, fim);
		}
		return vetor;
	}

	private int dividir(int[] vetor, int inicio, int fim) {
		int ponteiroEsq = inicio + 1;
		int ponteiroDir = fim;
		int pivo = vetor[inicio];
		int aux;

		while (ponteiroEsq <= ponteiroDir) {
			while (ponteiroEsq <= ponteiroDir && vetor[ponteiroEsq] <= pivo) {
				ponteiroEsq++;
			}
			while (ponteiroDir >= ponteiroEsq && vetor[ponteiroDir] > pivo) {
				ponteiroDir--;
			}
			if (ponteiroEsq <= ponteiroDir) {
				aux = vetor[ponteiroEsq];
				vetor[ponteiroEsq] = vetor[ponteiroDir];
				vetor[ponteiroDir] = aux;
				ponteiroEsq++;
				ponteiroDir--;
			}
		}
		vetor[inicio] = vetor[ponteiroDir];
		vetor[ponteiroDir] = pivo;
		return ponteiroDir;
	}
}
